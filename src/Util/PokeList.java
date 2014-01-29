//resource
//http://www.java2novice.com/java-interview-programs/arraylist-implementation/

package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PokeList<E> implements List<E> {

	private int maxSize = 20;
	private E[] pokemon;
	private int count = 1;	
//---------------------------------------------------------------------------------------------------------------
//Constructor
//---------------------------------------------------------------------------------------------------------------
	public PokeList(){
	pokemon = (E[]) new Object[maxSize];		//cast E to this array, with type Pokemon elements
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
	}

	@Override
	public Iterator <E> iterator() {
		return new PokeListIterator (this);
	}
	
	public class PokeListIterator <E> implements Iterator <E>{
		//fields
		private PokeList <E> list;
		private int nextIndex;
		private boolean canRemove = false;
		
		//constructor
		public PokeListIterator (PokeList <E> list){
			//this.list = new PokeList <Pokemon> list;
		}
		
		//returns true if the iterator has at least 1 more item
		public boolean hasNext() {
			return (nextIndex < list.count);
		}
		
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
	public boolean add(E e) {
		//first check if it's nearly run out of space in the array. if yes, extend the array
		if(pokemon.length-count <=5)							
			ensureCapacity();	
		this.pokemon[this.count++] = e;		//append this value to the end of the array
	
		System.out.println(pokemon[count]);
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
	public boolean remove(Object o){
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
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
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
	public E get(int index) {

		if(index < count)			
			return pokemon[index];			//returns a pokemon object from this index (this is the value at that index)
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

}
