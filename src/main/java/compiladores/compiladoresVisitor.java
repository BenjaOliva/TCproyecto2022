// Generated from /home/francisco/Escritorio/tc2/TC-TP2-Oliva-Ameri/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(compiladoresParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(compiladoresParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inst_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_simple(compiladoresParser.Inst_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecla(compiladoresParser.DeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(compiladoresParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(compiladoresParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaFuncion(compiladoresParser.DeclaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#invocacionFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocacionFun(compiladoresParser.InvocacionFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(compiladoresParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloqueDeControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueDeControl(compiladoresParser.BloqueDeControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParams(compiladoresParser.ListaParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgs(compiladoresParser.ListaArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(compiladoresParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(compiladoresParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(compiladoresParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionFor(compiladoresParser.CondicionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladoresParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(compiladoresParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(compiladoresParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(compiladoresParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(compiladoresParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(compiladoresParser.OContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(compiladoresParser.AndContext ctx);
}