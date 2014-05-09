/*
 * class FileSystem - overall class for holding the entire file system
 * 
 * Created - Paul J. Wagner, 4/11/2013
 * Modified - Paul J. Wagner, 4/24/2014 - updated comments
 */
package edu.uwec.cs.wagnerpj.filesystem.general;

import java.util.List;
import java.util.Arrays;

import edu.uwec.cs.wagnerpj.filesystem.hierarchy.Directory;

public class FileSystem {
	// data
	private Directory root;							// root of the file system
	private String currentWorkingDirectoryString;	// current working directory as String in the file system
	private Directory currentWorkingDirectory;		// current working directory object

	// methods
	// constructors
	// -- default constructor
	public FileSystem() {
		root = new Directory("");
		currentWorkingDirectoryString = "/";
		currentWorkingDirectory = root;
	}

	// other methods
	// -- toString() - overall top-level file system display
	public String toString() {
		String outputString = "";
		outputString += "fs: cwd is: " + currentWorkingDirectoryString;
		return outputString;
	}
	
	// -- genDisplay - generate display of file system (gathers each file system display recursively)
	public String genDisplay() {
		String displayString = "";
		displayString = root.display(0);
		return displayString;
	}
	
	// -- getCurrentWorkingDirectoryString - return the current working directory as a string
	public String getCurrentWorkingDirectoryString() {
		return currentWorkingDirectoryString;
	}
	
	// -- getCurrentWorkingDirectory - return the current working directory as a Directory object
	public Directory getCurrentWorkingDirectory() {
		return currentWorkingDirectory;
	}
	
	// -- setCurrentWorkingDirectory - set the current working directory and string to the new directory
	public void setCurrentWorkingDirectory(String newDirString) {
		System.out.println(newDirString);
		
		if (newDirString.charAt(0) == '.' && newDirString.charAt(1) == '.') {		// .. - change to parent
			// TODO: change to parent (if exists/not at root)
			String[]  directories = currentWorkingDirectoryString.split("/");
			System.out.println(directories.length);
			if(directories.length > 3){
				//currentWorkingDirectory = Directory(directories[directories.length - 2]);
			}
		} else if (newDirString.charAt(0) == '~') {		// ~ - change to root
			// TODO: change to root
			currentWorkingDirectory = root;
		} else {										// change to specified subdirectory if it exists
			// TODO: find child object with this name
			boolean exists = false;
			for(int i = 0; i < currentWorkingDirectory.getChildren().size(); i++){
				if(currentWorkingDirectory.getChildren().get(i).getName().compareTo(newDirString) == 0){
					exists = true;
				}
			}
			// if child exists, set current object and string
			if(exists){
				//   set current working directory object
				currentWorkingDirectory = new Directory(newDirString);
				//   set current working directory string
				currentWorkingDirectoryString = currentWorkingDirectoryString + "/" + newDirString;	// assuming child exists
			} else {
				// else if child doesn't exist
				// error
				System.out.println("ERROR: No such file or directory");
			}
			
		}
		
		System.out.println("Current directory: " + currentWorkingDirectoryString);
		for(int i = 0; i < currentWorkingDirectory.getChildren().size(); i++){
			System.out.println("Files: "+ currentWorkingDirectory.getChildren().get(i));
		}
		System.out.println("Root directory: " + root.display(0));
	}
	
	// -- getRoot - return the root directory of the file system
	public Directory getRoot() {
		return root;
	}
	
}	// end - class FileSystem
