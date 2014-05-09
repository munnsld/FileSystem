package edu.uwec.cs.wagnerpj.filesystem.commands;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.File;

public class CatCommand extends AbstractCommand {
	// data
	// -- brings fs down from AbstractCommand
	
	// methods
	// constructors
	public CatCommand() {
		// none at this time
	}
	
	public CatCommand(FileSystem fs) {
		this.fs = fs;
	}

	// other methods
	// -- execute - execute the command
	//[name, size, content]
	public String execute(String [] params) {
		String outputString = "";
		Directory currentDir = fs.getCurrentWorkingDirectory();
		
		
		File file = new File();
		for (int i=0; i < currentDir.countChildren(); i++){
			if (currentDir.getChildren().get(i).getName().equals(params[1])){
				file = (File) currentDir.getChildren().get(i);
				outputString = file.getContents();
			}
		}
		return outputString;
	}

}	// end - class MkfileCommand
