package edu.uwec.cs.wagnerpj.filesystem.commands;

import java.util.ArrayList;

import edu.uwec.cs.wagnerpj.filesystem.general.FileSystem;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.File;
import edu.uwec.cs.wagnerpj.filesystem.hierarchy.FileSystemObject;

public class DuCommand extends AbstractCommand {
	// data
	int totalSize = 0;
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
		totalSize=0;
		Directory currentDir = fs.getCurrentWorkingDirectory();
		ArrayList<FileSystemObject> children = currentDir.getChildren();
		duRecurse(children);
	String outputString = "du> size = " + totalSize;
		return outputString;
	}

	
	public void duRecurse(ArrayList<FileSystemObject> children){
		
		ArrayList<File> files = new ArrayList<File>();
		ArrayList<Directory> directories = new ArrayList<Directory>();
		for(int i = 0; i < children.size(); i++){
			totalSize += children.get(i).getSize();
			if( children.get(i).getSize()==0){
				//this means that it is a directory
				directories.add((Directory) children.get(i));
			}
		}
		for(int i = 0; i < directories.size(); i++){
			duRecurse(directories.get(i).getChildren());
		}
		
		
		
	}
	
	
}	// end - class MkfileCommand
