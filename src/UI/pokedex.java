package UI;

	import java.util.*;
import java.io.*;

import util.PokeList;
import util.PokeSet;
import util.Pokemon;

	public class Pokedex {

//fields
	private List <Pokemon> pokelist;
	//private Set <Pokemon> pokeset;
	//private Map <String, Pokemon> pokemap;
	
	private String selection;
//---------------------------------------------------------------------------------------------------------------
// constructor
//---------------------------------------------------------------------------------------------------------------

	public Pokedex (){
		readFile();
		System.out.println("Welcome to my Pokedex.");
		homeScreen();
	}
	
	public void readFile(){
		try {
		Scanner sc = new Scanner(new File("pokemon.txt"));
		this.pokelist = new PokeList <Pokemon> ();
		//this.pokeset = new PokeSet <Pokemon> ();
		
		while(sc.hasNext()){
			//harvest info
			int id = sc.nextInt();
			String name = sc.next();
			String type = sc.nextLine();
			
			
			//now create the object and put it in the pokelist
			this.pokelist.add(new Pokemon(id,name,type));				//currently not adding to the array
			//System.out.println(name  + type + "		" +id);
		}
		
		sc.close();
		System.out.println("Pokedex loaded.");
		} catch (IOException e) {System.out.println("Could not find the file.");}
		
	}
//---------------------------------------------------------------------------------------------------------------
// Home Screen: this is where the user can choose what search they want
//---------------------------------------------------------------------------------------------------------------

	public void homeScreen(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the capital letter of the type of search you would like. 'P' for print all info, 'N' for name, 'I' for ID, of 'T' for type.");
		this.selection = sc.next();
		sc.close();
		functions();
	}
	//---------------------------------------------------------------------------------------------------------------
//		When the user types a letter, the search algorithm corresponding to that letter is called
	//---------------------------------------------------------------------------------------------------------------

	public void functions(){
		if(this.selection.equals("P")){
			printAllInfo();
		} else if(this.selection.equals("N")){
			searchName();
		} else if (this.selection.equals("I")){
			searchID();
		} else if (this.selection.equals("T")){
			System.out.println("You have chosen to search by type.");
			searchType();
		} else {
			System.out.println("I'm sorry, your selection was invalid. Please try again.");
			homeScreen();
		}
	}
	//---------------------------------------------------------------------------------------------------------------
	//Search by name. Output = all other information on the Pokemon. List.
	//---------------------------------------------------------------------------------------------------------------
	public void printAllInfo(){
		//iterate through the list
		//print out all the names
		System.out.println("You have chosen to print all info.");
		
		for(Pokemon p : pokelist){
			System.out.println(p.toString());
		}
	}
	//---------------------------------------------------------------------------------------------------------------
	//Search by name. Output = all other information on the Pokemon. List.
	//---------------------------------------------------------------------------------------------------------------
	public void searchName(){
			
	}
	//---------------------------------------------------------------------------------------------------------------
	//Search by ID. Output = all other information on the Pokemon. Set.
	//---------------------------------------------------------------------------------------------------------------
	public void searchID(){
			
		
	}
	//---------------------------------------------------------------------------------------------------------------
	//Search by type. Output = all Pokemon names, that have this type. Map
	//---------------------------------------------------------------------------------------------------------------
	public void searchType(){
			
		
	}
	//---------------------------------------------------------------------------------------------------------------
	//Main method that runs the program
	//---------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		new Pokedex();		//call the constructor to invoke everything
	}
}

