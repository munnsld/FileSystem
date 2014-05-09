/*
 * class Parser - to parse commands to separate command from arguments
 * 
 * Created - Paul J. Wagner, 4/10/2013
 * Modified - Paul J. Wagner, 4/24/2014 - updated comments
 */
package edu.uwec.cs.wagnerpj.filesystem.general;

public class Parser {
	// data
	
	// methods
	// constructors
	// -- default constructor
	public Parser() {
	}
	
	// other methods
	// -- parseCommand(originalCommand) - split main command from arguments
	public String [] parseCommand(String originalCommand) {
		return originalCommand.split(" ");
	}

}	// end - class Parser
