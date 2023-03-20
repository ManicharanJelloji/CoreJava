package corejava1.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
//		LinkedList<String> ll2 = new LinkedList<>();
		ArrayList<String> al = new ArrayList<>();
		ll.add("ab");
		ll.add("11");
		ll.add("cd");
		ll.add(2,"ef");
		ll.add("12");
		ll.addFirst("AB");
		ll.addLast("YZ");
		ll.add("13");
		al.add("11");
		al.add("12");
		al.add("13");
		ll.offer("gh");//this will work as same add method,i.e, it will add at the last value.
		ll.offerFirst("ABC");//it's similar to addFirst
		ll.offerLast("XYZ");
//		ll.set(0, "13");
		ll.addAll(al);
		
//		ll.addAll(1,al);
		System.out.println(ll.size());
//		System.out.println(ll.get(5));
		System.out.println(ll);
		System.out.println(al);
//		System.out.println(ll.get(0));
//		ll.remove();//it start removing elements from first element.
//		ll.remove(3);
//		ll.remove("ef");
//		ll.removeAll(al);
//		ll.retainAll(al);
//		System.out.println(ll.contains("CD"));
//		System.out.println(ll.containsAll(al));
		System.out.println(ll.indexOf("13"));
//		System.out.println(ll.lastIndexOf("13"));
//		System.out.println(ll);
//		System.out.println(ll.get(0));
		
//		System.out.println(ll.subList(0, 6));
		System.out.println(ll);
		
	}

}
