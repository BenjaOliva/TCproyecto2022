package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Compilador!!!");
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/entrada.txt");

        compiladoresLexer lexer = new compiladoresLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        compiladoresParser parser = new compiladoresParser(tokens);
                
        compiladoresBaseListener escucha = new miListener(parser);

        parser.addParseListener(escucha);

        parser.prog();

        
    }
}
