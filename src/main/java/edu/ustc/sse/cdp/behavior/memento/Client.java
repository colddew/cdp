package edu.ustc.sse.cdp.behavior.memento;

public class Client {
	
	public String runStepOne() {
		
		Originator originator = new Originator();
		
		return originator.runStepOne();
	}
	
	public String runStepOneAndTwo() {
		
		Originator originator = new Originator();
		originator.runStepOne();
		
		return originator.runStepTwo();
	}
	
	public String runStepOneAndTwoAndThree() {
		
		Originator originator = new Originator();
		originator.runStepOne();
		originator.runStepTwo();
		
		return originator.runStepThree();
	}
	
	public String runStepOneAndTwoAndRestoreAndThree() {
		
		Originator originator = new Originator();
		originator.runStepOne();
		
		// 保存状态
		Memento memento = originator.createMemento();
		MementoStorage storage = new MementoStorage();
		storage.setMemento(memento);
		
		originator.runStepTwo();
		
		// 恢复状态
		originator.restoreMemento(storage.getMemento());
		
		return originator.runStepThree();
	}
}
