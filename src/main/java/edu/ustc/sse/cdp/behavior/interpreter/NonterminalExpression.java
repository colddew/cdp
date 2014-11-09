package edu.ustc.sse.cdp.behavior.interpreter;

/**
 * 非终结符解释器，相当于组合模式构建的抽象语法树的组合对象
 */
public class NonterminalExpression extends AbstractExpression {
	
	private AbstractExpression left;
	private AbstractExpression right;
	
	public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
		
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String interpret(Context context) {
		
		return left.interpret(context) + "," + right.interpret(context);
	}
}
