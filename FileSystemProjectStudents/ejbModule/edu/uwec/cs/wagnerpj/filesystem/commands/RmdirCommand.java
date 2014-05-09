
package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.File;

public class RmdirCommand extends AbstractCommand {
	// data
	// -- brings fs down from AbstractCommand
	
	// methods
	// constructors
	public RmdirCommand() {
		// none at this time
	}
	
	public RmdirCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	// -- execute - execute the command
	//[name, size, content]
	public String execute(String [] params) {
		String outputString = "rm> " + params[1] + " removed";
		Directory currentDir = fs.getCurrentWorkingDirectory();
		currentDir.removeChild(params[1]);
		return outputString;
	}

}	// end - class MkfileCommand

