package corejava1.collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> al= new ArrayList<>();
		hs.add("123");
		hs.add("Hashcode");
		hs.add("5555555555555555555555");
		
		hs.add(null);
		
		//we can add null(only one as hashSet doesn't take duplicate key value) to the Hashset and null is always stored in index 0
		
//		hs.add("123");
		al.add("ab");
		al.add("cd");
		al.add("ef");
		al.add("gh");
		hs.addAll(al);
//		Object[] array = hs.toArray();
//		for(Object arr:hs.toArray())
//			System.out.print(arr+ " ");
//		System.out.println();
//		Object[] array2 = hs.toArray(array);
//		for(Object arr2:hs.toArray(array))
//			System.out.print(arr2+ " ");
		//so when ever we add a arraylist with a hashset. here hashset internally depends on
		//Hashmap(where the values are stored in a key-value style)i.e, Hashset internally creates a HashMap whenever we store any value
		//in the Hashset. so here by default HashSet has a storage of 16 ab-1st index
		//123-2nd index
		//HashCode-8th index
		//55555555555555555555555-13th Index
		//but the important thing is cd,ef,gh are stored as a kind of LinkedList i.e, in the 1st index ab is stored and in the first index itself 
		//cd is stored but it's the next value in the first index assigned to ab, ef is also stored in first Index but ef is the next value of cd,
		//llly gh is also stored in first index but its the next value of ef
		//  1-"ab"->"cd"->"ef"->"gh"(in the first Index itself all the values are stored )
		//Set does not depends on index value only arraylist depends on indexs as arrays work based on index
		//As set does not depend on index it does not matter where the values are stored but its important to know it
		//set depends on key-value model(i.e HashMap)
		
		
//		Iterator<String> iterator = hs.iterator();
//		//there is only one iterator in HashSet 
//		System.out.println(iterator.next());
//		System.out.println(hs);
		
//		hs.remove("gh");
//		hs.remove("123");
//		hs.removeAll(al);
//		hs.retainAll(al);
//		System.out.println(hs.contains("123"));
//		hs.clear();
//		System.out.println(hs);
		
		System.out.println(hs.containsAll(al));
		
	}

}
