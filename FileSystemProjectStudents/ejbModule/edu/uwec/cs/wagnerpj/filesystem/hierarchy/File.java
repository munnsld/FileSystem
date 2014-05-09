/*
 * class File - represent file type of file system object
 * 
 * Created - Paul J. Wagner, 4/10/2013
 * Modified - Paul J. Wagner, 4/24/2013 - updated comments
 */
package edu.uwec.cs.wagnerpj.filesystem.hierarchy;

public class File extends FileSystemObject {
	// data
	private String contents;		// simulated contents of file as string
	
	// methods
	// constructors
	// -- default constructor
	public File() {
		this("default", 0, "none");
	}
	
	// -- all-arg constructor
	public File(String name, int size, String contents) {
		this.setName(name);
		this.size = size;
		this.contents = contents;
	}
	
	// other methods
	// -- toString - convert file to a string
	public String toString() {
		return "File: " + getName() + " (" + size + ")\n";
	}
	
	public String getContents(){
		return contents;
	}
	
	// -- display() - display the file information to a string
	public String display(int level) {
		String displayString = "";
		
		displayString += printHelper.genSpaces(level);
		displayString += (getName() + "\n");
		
		return displayString;	
	}

}	// end - class File
