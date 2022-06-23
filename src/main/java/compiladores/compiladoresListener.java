// Generated from /home/francisco/Escritorio/tc2/TC-TP2-Oliva-Ameri/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(compiladoresParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(compiladoresParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(compiladoresParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(compiladoresParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void enterInst_simple(compiladoresParser.Inst_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void exitInst_simple(compiladoresParser.Inst_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#decla}.
	 * @param ctx the parse tree
	 */
	void enterDecla(compiladoresParser.DeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#decla}.
	 * @param ctx the parse tree
	 */
	void exitDecla(compiladoresParser.DeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(compiladoresParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(compiladoresParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaFuncion(compiladoresParser.DeclaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaFuncion(compiladoresParser.DeclaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 */
	void enterListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 */
	void exitListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#invocacionFun}.
	 * @param ctx the parse tree
	 */
	void enterInvocacionFun(compiladoresParser.InvocacionFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#invocacionFun}.
	 * @param ctx the parse tree
	 */
	void exitInvocacionFun(compiladoresParser.InvocacionFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(compiladoresParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(compiladoresParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloqueDeControl}.
	 * @param ctx the parse tree
	 */
	void enterBloqueDeControl(compiladoresParser.BloqueDeControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloqueDeControl}.
	 * @param ctx the parse tree
	 */
	void exitBloqueDeControl(compiladoresParser.BloqueDeControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void enterListaParams(compiladoresParser.ListaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void exitListaParams(compiladoresParser.ListaParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(compiladoresParser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(compiladoresParser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(compiladoresParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(compiladoresParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(compiladoresParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(compiladoresParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(compiladoresParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(compiladoresParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicionFor}.
	 * @param ctx the parse tree
	 */
	void enterCondicionFor(compiladoresParser.CondicionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicionFor}.
	 * @param ctx the parse tree
	 */
	void exitCondicionFor(compiladoresParser.CondicionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(compiladoresParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(compiladoresParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(compiladoresParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(compiladoresParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(compiladoresParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(compiladoresParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(compiladoresParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(compiladoresParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#o}.
	 * @param ctx the parse tree
	 */
	void enterO(compiladoresParser.OContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#o}.
	 * @param ctx the parse tree
	 */
	void exitO(compiladoresParser.OContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(compiladoresParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(compiladoresParser.AndContext ctx);
}