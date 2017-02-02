package cs331.sorting;

import java.util.List;

public interface Sort<T extends Comparable<?>> 
{
	// This method should setup the list that is to be sorted
	public void init(List<T> list);
	
	// I'm going to call this method when I want to extract the sorted list 
	// after initializing it. Make sure that it sorts the list if it is not
	// already sorted.
	public List<T> getSortedList();
}
