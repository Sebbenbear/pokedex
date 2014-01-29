package util;

import java.util.*;
import java.io.*;

public class Pokemon {

//fields	
	
private int id;
private String name;
private String type;

//------------------------------------------------------------------------------	
// create a new pokemon of the given id, name and type/s	
//------------------------------------------------------------------------------
	
public Pokemon(int i, String n, String t){
	//make these into a pokemon object
	this.id = i;
	this.name = n;
	this.type = t;
}

public int getID() {return id;}

public String getName() {return name;}

public String getType() {return type;}

public String toString() {return (getID() + " " + getName() + " " + getType())  ;}
	
}
