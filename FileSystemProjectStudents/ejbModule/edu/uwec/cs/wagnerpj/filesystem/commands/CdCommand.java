/*
 * CDCommand - command to change directory to a specified directory
 * 
 * Created - Paul J. Wagner, 4/27/2014 - format: cd newdir (name or .. for parent)
 */
package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;

public class CdCommand extends AbstractCommand {
	// data
	// -- brings fs down from AbstractCommand
	
	// methods
	// constructors
	public CdCommand() {
		// none at this time
	}
	
	public CdCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	// -- execute
	public String execute(String [] params) {
		// TODO: this is just a start - can be changed for directory below vs. .. (directory above),
		//       also what if directory below doesn't exist?
		
		//If params[1] isn't in the currentWorkingDirectory then it will never set is_directory to true.
		boolean is_directory = false;
		for(int i = 0; i < fs.getCurrentWorkingDirectory().getChildren().size(); i++){
			if(fs.getCurrentWorkingDirectory().getChildren().get(i).getName().compareTo(params[1]) == 0){
				is_directory = true;
			}
		}
		
		//If the user entered .. or ~ let the FileSystem handle it and check if these directory changes can be made.
		if(params[1].compareTo("~") == 0 || params[1].compareTo("..") == 0)
			is_directory = true;
		
		String outputString = " ";
		
		if(is_directory){
			outputString = "cd> cwd changed to " + params[1];
			fs.setCurrentWorkingDirectory(params[1]);
		} else if(!is_directory){
			outputString = params[1] + ": No such file or directory";
		}
		return outputString;
	}

}	// end - class MkdirCommand
