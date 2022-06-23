package compiladores;

import java.util.Iterator;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.TerminalNode;


import compiladores.compiladoresParser.*;


import tablaSimbolos.*;

public class miListener extends compiladoresBaseListener {
    private TablaSimbolos tablaSimbolos = new TablaSimbolos();
    private LinkedList<ID> paramsFuncion = new LinkedList<ID>();

    miListener(compiladoresParser parser){
    }
    
    private void StrSemanticoD(TerminalNode id) {
        System.out.println("Doble declaración (" + id + ")");

    }
    
    private void StrSemanticoND(TerminalNode id) {
        System.out.println("Identificador no declarado (" + id + ")");
    }


    private void StrSemanticoI(TerminalNode id) {
        System.out.println("Identificador no inicializado (" + id + ")");
    }

    private void StrSemanticoDN(){

        System.out.println("Identificador declarado pero no usado");
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        System.out.println("INICIO DEL CONTEXTO");
        tablaSimbolos.addContext();
        if(paramsFuncion.size() > 0){
            for (ID id : paramsFuncion) {
                tablaSimbolos.addID(id);
            }
        }
        paramsFuncion.clear();
    }

    @Override
    public void exitDeclaFuncion(DeclaFuncionContext ctx) {
        if(this.tablaSimbolos.searchID(ctx.ID().getText()) != null){
            StrSemanticoD(ctx.ID());
            return;
        }

        LinkedList<TipoDato> list = new LinkedList<>();

        Iterator<ID> iterator = paramsFuncion.descendingIterator();
        if(paramsFuncion.size() > 0){
            while (iterator.hasNext())
            {
                TipoDato tipoDato = new TipoDato(iterator.next().getTipo());
                list.add(tipoDato);
            }
        }
        Funcion funcion = new Funcion(list, ctx.ID().getText(), ctx.tipoDato().getText(), '{');
        tablaSimbolos.addID(funcion);
    }

    @Override
    public void exitParametro(ParametroContext ctx) {
        if(ctx.getChildCount() != 0){
            Variable id = new Variable(ctx.ID().getText(), ctx.tipoDato().getText(), true);
            this.paramsFuncion.add(id);
        }
    }
  
    @Override
    public void exitInvocacionFun(InvocacionFunContext ctx) {
        ID temp = this.tablaSimbolos.searchID(ctx.ID().getText());
        if(temp == null){
            StrSemanticoND(ctx.ID());
        }else{
            temp.setUsada(true);
        }
    }

    @Override
    public void exitDecla(DeclaContext ctx) {
        if(this.tablaSimbolos.searchID(ctx.ID().getText()) != null){
            StrSemanticoD(ctx.ID());
            return;
        }

        String tipoDato = ctx.tipoDato().getText();
        String ID = ctx.ID().getText();

        ListaDeclaContext lista = ctx.listaDecla();

        // Para el caso de int x donde no hay listaDecla
        if(lista.getChildCount() == 0) {
            Variable id = new Variable(ID, tipoDato, false);
            tablaSimbolos.addID(id);
        }

        // Para una Decla de varias variables
        while (lista.getChildCount() != 0) {
            if (lista.getChild(0).getText() == "=") {
                Variable id = new Variable(ID, tipoDato, true);
                tablaSimbolos.addID(id);
            }
            if (lista.getChild(0).getText() ==",") {
                if(!lista.getParent().getChild(0).getText().equals("=")) {
                    Variable id = new Variable(ID, tipoDato, false);
                    tablaSimbolos.addID(id);
                }
                ID = lista.ID().getText();
                if(lista.listaDecla().getChildCount() == 0) {
                    Variable ultimoId = new Variable(ID, tipoDato, false);
                    tablaSimbolos.addID(ultimoId);
                }
            }
            lista = lista.listaDecla();
        }
    }

    @Override
    public void exitFactor(FactorContext ctx) {
        if(ctx.ID() == null){
            return;
        }
        ID temp = this.tablaSimbolos.searchID(ctx.ID().getText());
        if(temp == null) {
            StrSemanticoND(ctx.ID());
            return;
        }
        else {
            if(!temp.getInicializada()) {
                StrSemanticoI(ctx.ID());
                return;
            }
            temp.setUsada(true);
        }
    }

  
    @Override
    public void exitCondicionFor(CondicionForContext ctx) {
        if (ctx.ID() != null) {
            ID temp = this.tablaSimbolos.searchID(ctx.ID().getText());
            if(temp == null) {
                StrSemanticoND(ctx.ID());
                return;
            }
            if(!temp.getInicializada()) {
                StrSemanticoI(ctx.ID());
                //System.out.println("ERROR SEMANTICO: Uso de un identificador no inicializado -- ID: " + ctx.ID());
                return;
            }
            temp.setUsada(true);
        }
    }


    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        ID temp = this.tablaSimbolos.searchID(ctx.ID().getText());
        if(temp == null){
            
            StrSemanticoND(ctx.ID());
            return;
        }
        temp.setInicializada(true);
    }
  


    @Override
    public void exitBloque(BloqueContext ctx) {
        int ultimaPosicion = tablaSimbolos.getSimbolos().size()-1;
        for (var entrada : tablaSimbolos.getSimbolos().get(ultimaPosicion).entrySet()) {
            if(!entrada.getValue().getUsada()) {
                StrSemanticoDN();
                System.out.print("");
            }
            System.out.println("(" + entrada.getKey() + ") " + entrada.getValue());
        }
        System.out.println("FIN DEL CONTEXTO");
        tablaSimbolos.deleteContext();
    }

    @Override
    public void enterProg(ProgContext ctx) {
        System.out.println("");
        System.out.println("INICIO");

    }

    @Override
    public void exitProg(ProgContext ctx) {
        int ultimaPosicion = tablaSimbolos.getSimbolos().size()-1;
        for (var entrada : tablaSimbolos.getSimbolos().get(ultimaPosicion).entrySet()) {
            if(!entrada.getValue().getUsada()) {
                StrSemanticoDN();
                System.out.print("");
            }
            System.out.println("(" + entrada.getKey() + ") " + entrada.getValue());
        }
        tablaSimbolos.deleteContext();
        System.out.println("FIN");

    }
    
}
