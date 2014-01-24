package Util;

import java.util.*;
import java.io.*;

//this is an abstract list
public class PokeList <E> implements List <E> {

private int maxSize = 20;
	
private Object[] pokemon;
private int count = 0;

//resource
//http://www.java2novice.com/java-interview-programs/arraylist-implementation/


//---------------------------------------------------------------------------------------------------------------
//Constructor
//---------------------------------------------------------------------------------------------------------------
public PokeList(){
	//initialize the array
	pokemon = new Object[maxSize];
}
//---------------------------------------------------------------------------------------------------------------
//Size method
//---------------------------------------------------------------------------------------------------------------
	@Override
	public int size() {
		return count;
	}
//---------------------------------------------------------------------------------------------------------------
//is empty method
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean isEmpty() {
			return(count == 0);	//if there is nothing in the array, the size will be 0
	}
//---------------------------------------------------------------------------------------------------------------
//contains method
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < size(); i++){
			if(get(i).equals(o))			//define this in terms of size and get
				return true;
		}
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
//Iterator
//---------------------------------------------------------------------------------------------------------------	
	@Override
	public Iterator<E> iterator() {
		
		
		
		return null;
	}
//---------------------------------------------------------------------------------------------------------------
//toArray Method
//---------------------------------------------------------------------------------------------------------------
	@Override
	public Object[] toArray() {
		
		//turn this object into an array format
		//how
		//this object = new Array
		//Object[] objArray = new Object[];
		
		return null;
	}
//---------------------------------------------------------------------------------------------------------------
//toArray Method
//---------------------------------------------------------------------------------------------------------------
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
//---------------------------------------------------------------------------------------------------------------
//adds it to the end of the list
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean add(E e) {
		if(pokemon.length-count <=5){									//if the count of item approaches the end of the list
			ensureCapacity();		//, extend it , in this case you double it
		}
		
		pokemon[count++] = e;		//add this value to the end of the array
		//if it was successful, return true, if not return false
			return true;
	}
	
//---------------------------------------------------------------------------------------------------------------
//ensure the capacity
//---------------------------------------------------------------------------------------------------------------
	public void ensureCapacity() {
		if(pokemon.length-count <=5){									//if the count of item approaches the end of the list
			pokemon = Arrays.copyOf(pokemon,  pokemon.length*2);
		}
	}

//---------------------------------------------------------------------------------------------------------------
//remove a value
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean remove(Object o) {
		//find the object
		//take it out of the array
		//change the size of the count
		
				//remove it from the array
				//shift all the other values down over it
				int orig = this.count;
				
				for (int i = 0; i < pokemon.length; i++){
					if(pokemon[i].equals(o)){		//if the value at this index matches our value
						if(i<pokemon.length)
						pokemon[i] = pokemon [i+1];	//then replace it with the value on the right
						 else 					//if i == the last value on the array
							this.count--;				//shorten the size of the array, to get rid of the duplicate last value
						}
					}
				if(orig==this.count)	//if the count of the array hasn't changed, nothings been removed
					return false;
				else
					return true;
		
	}
//---------------------------------------------------------------------------------------------------------------
// returns true if the array contains all the values in the collection
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean containsAll(Collection<?> c) {
		
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
// returns true if you added all the values to the array
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean addAll(Collection<? extends E> c) {
		//extend the array to accomodate the number of items in the collection
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
// returns true if you added all the values to the array, starting from the specified index
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
// returns true if you added all the values to the array, starting from the specified index
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
//  retains the 
//---------------------------------------------------------------------------------------------------------------
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
//---------------------------------------------------------------------------------------------------------------
//  clears the array
//---------------------------------------------------------------------------------------------------------------	
	@Override
	public void clear() {
		while (size() > 0)		//defined in terms of size and remove
			remove(0);
		
	}

	@Override
	public E get(int index) {
		if(index < count)			
			return (E) pokemon[index];
		else 
			throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	//private class ArrayListIterator {
	//}
	
	
}
