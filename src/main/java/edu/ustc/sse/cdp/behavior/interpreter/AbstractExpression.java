package edu.ustc.sse.cdp.behavior.interpreter;

/**
 * 解释器模式将某种语言的一套语法规则（文法）定义为一系列解释器，适用于语法比较简单和对效率要求不高的场景
 * 
 * 解析器将表达式解析成抽象语法树，解释器按照抽象语法树解释执行
 */
public abstract class AbstractExpression {
	
	public abstract String interpret(Context context);
}
