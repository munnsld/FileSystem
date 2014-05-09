/* 
 * class FileSystemObject - abstract composite class for each general file system object
 * 
 * Created - Paul J. Wagner, 4/10/2013
 * Modified - Paul J. Wagner, 4/24/2014 - additional comments
 */
package edu.uwec.cs.wagnerpj.filesystem.hierarchy;

import edu.uwec.cs.wagnerpj.filesystem.utilities.PrintHelper;

public abstract class FileSystemObject {
	// data
	private String name;			// file system object name
	protected int    size;			// file system object size
	protected PrintHelper printHelper = new PrintHelper();	// print helper for file system display
	
	// methods
	// constructors
	// -- default constructor
	public FileSystemObject() {
		this("default", 0);
	}

	// -- all-arg constructor
	public FileSystemObject(String name, int size) {
		this.setName(name);
		this.size = size;
	}
	
	public int getSize(){
		
		return size;
	}

	// other methods	
	// -- display() - generate display string from file system traversal
	public abstract String display(int level);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}	// end - class FileSystemObject
