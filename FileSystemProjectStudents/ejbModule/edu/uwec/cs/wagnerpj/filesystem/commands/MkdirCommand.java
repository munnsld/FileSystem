/*
 * MkdirCommand - command to make directory in current directory
 * 
 * Created - Paul J. Wagner, 4/27/2014 - format: mkdir name
 */
package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;

public class MkdirCommand extends AbstractCommand {
	// data
	// -- brings fs down from AbstractCommand
	
	// methods
	// constructors
	public MkdirCommand() {
		// none at this time
	}
	
	public MkdirCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	// -- execute - execute the command
	public String execute(String [] params) {
		String outputString = "mkdir> " + params[1] + " added";
		Directory currentDir = fs.getCurrentWorkingDirectory();
		currentDir.addChild(new Directory(params[1]));
		return outputString;
	}

}	// end - class MkdirCommand
