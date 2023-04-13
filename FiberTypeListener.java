// Generated from FiberType.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FiberTypeParser}.
 */
public interface FiberTypeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(FiberTypeParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(FiberTypeParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#fiberType}.
	 * @param ctx the parse tree
	 */
	void enterFiberType(FiberTypeParser.FiberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#fiberType}.
	 * @param ctx the parse tree
	 */
	void exitFiberType(FiberTypeParser.FiberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#opticalComponent}.
	 * @param ctx the parse tree
	 */
	void enterOpticalComponent(FiberTypeParser.OpticalComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#opticalComponent}.
	 * @param ctx the parse tree
	 */
	void exitOpticalComponent(FiberTypeParser.OpticalComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#fibertypeSelection}.
	 * @param ctx the parse tree
	 */
	void enterFibertypeSelection(FiberTypeParser.FibertypeSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#fibertypeSelection}.
	 * @param ctx the parse tree
	 */
	void exitFibertypeSelection(FiberTypeParser.FibertypeSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#opticalComponentAddition}.
	 * @param ctx the parse tree
	 */
	void enterOpticalComponentAddition(FiberTypeParser.OpticalComponentAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#opticalComponentAddition}.
	 * @param ctx the parse tree
	 */
	void exitOpticalComponentAddition(FiberTypeParser.OpticalComponentAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiberTypeParser#distanceAndFiberTypeSelection}.
	 * @param ctx the parse tree
	 */
	void enterDistanceAndFiberTypeSelection(FiberTypeParser.DistanceAndFiberTypeSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiberTypeParser#distanceAndFiberTypeSelection}.
	 * @param ctx the parse tree
	 */
	void exitDistanceAndFiberTypeSelection(FiberTypeParser.DistanceAndFiberTypeSelectionContext ctx);
}