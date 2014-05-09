package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.File;

public class DuCommand extends AbstractCommand {
	// data
	// -- brings fs down from AbstractCommand
	
	// methods
	// constructors
	public DuCommand() {
		// none at this time
	}
	
	public DuCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	// -- execute - execute the command
	//[name, size, content]
	public String execute(String [] params) {
		String outputString = "";
		Directory currentDir = fs.getCurrentWorkingDirectory();
		currentDir.getChildren().size() = outputString;
	
		return outputString;
	}

}	// end - class MkfileCommand
