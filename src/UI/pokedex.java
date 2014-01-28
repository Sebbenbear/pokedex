package UI;

	import java.util.*;
	import java.io.*;

	public class pokedex {

//fields
	private List <Pokemon> pokemon;
	private String selection;
	
//---------------------------------------------------------------------------------------------------------------
// constructor
//---------------------------------------------------------------------------------------------------------------

	public pokedex (){
		this.pokemon = new PokeList <Pokemon> ();
	}
	
	public static void readFile(){
		try {
		Scanner sc = new Scanner(new File("pokemon.txt"));
		
		//read the input into the various data structures used in the search
		//testing purposes
		while(sc.hasNext()){
		System.out.println(sc.next());
		}
		
		//read these into the arraylist
		
		sc.close();
		} catch (IOException e) {System.out.println("Could not find the file.");}
		
	}
//---------------------------------------------------------------------------------------------------------------
// Home Screen: this is where the user can choose what search they want
//---------------------------------------------------------------------------------------------------------------

	public void homeScreen(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to my Pokedex.");
		System.out.println("Please enter the capital letter of the type of search you would like. 'N' for name, 'I' for ID, of 'T' for type.");
		this.selection = sc.next();
		sc.close();
		functions();
	}
	//---------------------------------------------------------------------------------------------------------------
//		When the user types a letter, the search algorithm corresponding to that letter is called
	//---------------------------------------------------------------------------------------------------------------

	public void functions(){
		if(this.selection.equals("N")){
			searchName();
		} else if (this.selection.equals("I")){
			searchID();
		} else if (this.selection.equals("T")){
			searchType();
		} else {
			System.out.println("I'm sorry, your selection was invalid. Please try again.");
			homeScreen();
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
			// TODO Auto-generated method stub
			System.out.println("Welcome to my Pokedex.");
			readFile();
		
	}
}

