package corejava1.collectionframework;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Double> ts=new TreeSet<>(new TreeSetComparator());
		//HashSet is internally extends HashMap
		//LinkedHashSet is internally extends LinkedHashMap
		//TreeSet is internally extends TreeMap
		//TreeSet implements Navigable set
		//public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable
		ts.add(45.12);
		ts.add(89.41);
		ts.add(96.74);
		ts.add(56.78);
		ts.add(12.58);
		ts.add(123.63);
		ts.add(54.87);
//		Iterator<Double> iterator = ts.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		LinkedList<Double> ll = new LinkedList<>();
		ll.add(10.75);
		ll.add(75.23);
		ll.add(96.52);
		
		ts.addAll(ll);
		System.out.println(ts);
		
//		Object[] arr = ts.toArray();
//		for(Object arr1:ts.toArray())
//			System.out.print(arr1+" ");
//		System.out.println();
//		System.out.println(ts);
//		ts.remove(96.52);
//		ts.retainAll(ll);
//		System.out.println(ts);
		// still here we have discussed set related methods
		//now we are going to discuss sorted set related methods
//		SortedSet<Double> subSet = ts.subSet(123.63, 54.87);
//		System.out.println(subSet);
//		SortedSet<Double> headSet = ts.headSet(45.12);
//		System.out.println(headSet);
//		SortedSet<Double> tailSet = ts.tailSet(96.0);
//		System.out.println(tailSet);
		
//		System.out.println(ts.last());
		//still here we completed all the sortedSet Methods
		//from now we will discuss Navigable Set
//		System.out.println(ts.lower(56.78));
//		System.out.println(ts.floor(56.78));
//		System.out.println(ts.higher(56.78));
//		System.out.println(ts.ceiling(56.78));
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());		
		
		
		
	}
}
