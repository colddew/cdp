package edu.ustc.sse.cdp.behavior.memento;

/**
 * 保存备忘录对象的地方，原生器对象的状态保存在原生器外部
 * 
 * 备忘录可以保存在内存中或者其它的外部存储中
 */
public class MementoStorage {
	
	private Memento memento;

	public Memento getMemento() {
		
		return memento;
	}

	public void setMemento(Memento memento) {
		
		this.memento = memento;
	}
}
