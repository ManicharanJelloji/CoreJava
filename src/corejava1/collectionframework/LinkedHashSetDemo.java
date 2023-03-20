package corejava1.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		HashSet<String> hs=new HashSet<>();
		lhs.add("234");
		lhs.add("Linked");
		lhs.add("Hash");
		lhs.add("Set");
		lhs.add("987");
		
		hs.add("Example");
		hs.add("123");
		hs.add("Set");
		hs.add("Hash");
		lhs.addAll(hs);
//		System.out.println(lhs.containsAll(hs));
//		System.out.println(lhs); 
//		System.out.println(lhs.retainAll(hs));
		System.out.println(lhs.remove("123"));
		System.out.println(hs);
		System.out.println(lhs);
		lhs.clear();
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
	}

}
