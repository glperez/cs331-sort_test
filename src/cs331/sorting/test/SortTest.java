package cs331.sorting.test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import cs331.sorting.Sort;
import cs331.sorting.glp.*;

public class SortTest {

	@Test
	public void sortTest() {
		int n = 10;
		List<Integer> unsorted = new LinkedList<>();
		
		Random gen = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < n; i++)
			unsorted.add(gen.nextInt());
		
		System.out.println(unsorted);
		
		Sort<Integer> s = new MergeSort<>();
		s.init(unsorted);

		List<Integer> sorted = s.getSortedList();
		
		assertTrue(SortTest.isListSorted(sorted));
	}
	private static <T extends Comparable<T>> boolean isListSorted(List<T> list)
	{
		Iterator<T> i = list.iterator();
		T prev = i.next();
		
		while(i.hasNext())
		{
			T next = i.next();
			if(next.compareTo(prev) < 0)
				return false;
			prev = next;
		}
		return true;
	}

}
