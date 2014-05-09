/*
 * PwdCommand - command class for pwd (show current directory)
 * 
 * Created - Paul J. Wagner, 4/10/2013
 * Modified - Paul J. Wagner, 4/24/2014 - changed output to return instead of display
 */
package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;

public class PwdCommand extends AbstractCommand {
	// data
	
	// methods
	// constructors
	public PwdCommand() {
		
	}
	
	public PwdCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	public String execute(String [] params) {
		String outputString = "";

		outputString = "pwd> " + fs.getCurrentWorkingDirectoryString();
		return outputString;
	}

}	// end - class PwdCommand
