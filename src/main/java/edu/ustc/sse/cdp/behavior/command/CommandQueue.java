package edu.ustc.sse.cdp.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
	
	private static List<Command> commands = new ArrayList<Command>();
	
	public static void offer(Command command) {
		
		commands.add(command);
	}
	
	public static Command poll() {
		
		if(null != commands && commands.size() > 0) {
			
			Command command = commands.get(0);
			
			commands.remove(0);
			
			return command;
		}
		
		return null;
	}
}
