/*
 * class Directory - represent directory type of file system object
 * 
 * Created - Paul J. Wagner, 4/10/2013
 * Modified - Paul J. Wagner, 4/24/2013 - updated comments
 */
package edu.uwec.cs.wagnerpj.filesystem.hierarchy;

import java.util.ArrayList;

/**
 * @author paul
 *
 */
public class Directory extends FileSystemObject {
	// data
	// TODO: add arraylist of children (of any file system type) to implement Composite recursive structure
	protected ArrayList <FileSystemObject> children;
	// methods
	// constructors
	// -- default constructor
	public Directory() {
		this("default");
	}
	
	// -- name constructor
	public Directory(String name) {
		this.setName(name);
		this.size = 0;
		// TODO: initialize children
		this.children = new ArrayList<FileSystemObject>();
	}

	// other methods
	// -- getChildren() - get the children list of this directory
	// TODO: return children
	public ArrayList<FileSystemObject> getChildren(){
		return children;
	}
	
	// -- addChild(child) - add a child to this directory
	// TODO: add a child to the children arraylist
	public void addChild(FileSystemObject child){
		children.add(child);
	}
	
	//-removeChild(child) - removes a child from this directory
	
	public void removeChild(String child){
		children.remove(child);
	}
	
	
	// -- countChildren - count the number of children in the directory
	public int countChildren() {
		return children.size();
	}
	
	// -- toString - convert the directory to a string
	public String toString() {
		return "dir : " + getName() + "\n";
	}
		
	// -- display() - display this directory and children (possibly recursively) to a String
	public String display(int level) {
		String displayString = "";

		displayString += printHelper.genSpaces(level);
		displayString += (getName() + "/" + "\n");
		// TODO: for each child, add their display at level + 1 to the display string
		
		return displayString;
	}	
	
}	// end - class Directory
