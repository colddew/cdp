package edu.ustc.sse.cdp.behavior.interpreter;

/**
 * 终结符解释器，相当于组合模式构建的抽象语法树的叶子对象
 */
public class TerminalExpression extends AbstractExpression {
	
	private String name;
	
	public TerminalExpression(String name) {
		
		this.name = name;
	}
	
	@Override
	public String interpret(Context context) {
		
		return context.get(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(null != obj && null != name && obj instanceof TerminalExpression) {
			
			TerminalExpression expression = (TerminalExpression) obj;
			if(name.equals(expression.name)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int hashcode = 17;
		
		return hashcode + name.hashCode();
	}
}
