package edu.ustc.sse.cdp.behavior.interpreter;

public class Client {
	
	public String interpret() {
		
		// 生成抽象语法树
		TerminalExpression left = new TerminalExpression("TerminalExpressionA");
		TerminalExpression right = new TerminalExpression("TerminalExpressionB");
		
		Context context = new Context();
		context.set(left, "TerminalExpressionA");
		context.set(right, "TerminalExpressionB");
		
		NonterminalExpression expression = new NonterminalExpression(left, right);
		
		// 解释执行
		return expression.interpret(context);
	}
}
