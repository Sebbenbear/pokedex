//resource
//http://www.java2novice.com/java-interview-programs/arraylist-implementation/

package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import UI.Pokemon;

public class PokeList<E> implements List<Pokemon> {

	private int maxSize = 20;
	private Object[] pokemon;
	private int count = 0;	
//---------------------------------------------------------------------------------------------------------------
//Constructor
//---------------------------------------------------------------------------------------------------------------
	public PokeList(){
	pokemon = new Object[maxSize];
	}	
	
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return(count == 0);	//if there is nothing in the array, the size will be 0
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < size(); i++){
			if(get(i).equals(o))			//define this in terms of size and get
				return true;
		}
		return false;
		
		/*
		 * 
		 */
		
	}

	@Override
	public Iterator <Pokemon> iterator() {
		return null;
		
	}
	
	
	/*
	 * iterator has 3 methods
	 * 
	 */
	
	@SuppressWarnings({ "hiding", "unused" })
	private class PokeListIterator <E> implements Iterator <E>{
		//fields
		private PokeList <Pokemon> list;
		private int nextIndex;
		private boolean canRemove = false;
		
		//constructor
		public PokeListIterator (PokeList <Pokemon> list){
			//this.list = new PokeList <Pokemon> list;
			
		}
		
		//returns true if the iterator has at least 1 more item
		public boolean hasNext() {
			return (nextIndex < list.count);
		}
		
		@SuppressWarnings("unchecked")
		public E next() {
			if(nextIndex >= list.count)
				//throw new NoSuchElementException();	//this is OOB
			canRemove = true;
			E temp = (E) list.get(nextIndex);
			nextIndex++;
			return temp;
		}
		
		public void remove(){
			if(!canRemove)
				throw new IllegalStateException();
			canRemove = false;
			nextIndex--;
			//list.remove(nextIndex);
		}
		
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Pokemon e) {
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

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub		//TERRIBLE
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

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pokemon> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Pokemon> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		while (size() > 0)		//defined in terms of size and remove
			remove(0);
	}

	@Override
	public Pokemon get(int index) {

		if(index < count)			
			return (Pokemon) pokemon[index];			//returns a pokemon object from this index (this is the value at that index)
		else 
			throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public Pokemon set(int index, Pokemon element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Pokemon element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pokemon remove(int index) {
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
	public ListIterator<Pokemon> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Pokemon> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pokemon> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
