package corejava1.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.IntFunction;
//import java.util.Collection;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		ArrayList<String> al2= new ArrayList<>();
		ArrayList<String> al3= new ArrayList<>();
		ArrayList<Integer> al4= new ArrayList<>();
		al.add("ab");
		al.add("cd");
		al.add("ef");
		al.add("gh");
		al.add(2,"ij");
		al2.add("JAVA");
		al2.add("COLLECTION");
		al2.add("FRAMEWORK");
		al2.add(3,"example");
		al.addAll(al2);
		System.out.println(al);
		al4.add(12);
		al4.add(123);
		al4.add(1234);
		al4.add(12345);
		System.out.println(al.set(2, "ef"));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		System.out.println(al.remove(2));
//		System.out.println(al);
		System.out.println(al.remove("kl"));
		al3.add("MN");
		System.out.println(al3);
		al3.addAll(al);
//		al.addAll(al3);
		System.out.println(al3);
		al3.addAll(3, al2);
		
		
//		al.addAll(al4);//the important thing is we cannot add integer to string because Collection<? extends E> here E is String and ? is Integer and Integer doesn't extends String
		
//		al4.add(12356L);
//		System.out.println(al4);
		
//		Object[] array = al3.toArray();
//		for(Object arr:array)
//			System.out.print(arr+"  ");
//		System.out.println();
		
//		if(al.containsAll(al3))System.out.println("same object");
//		else System.out.println("not same");
		
//		if(al3.containsAll(al)) System.out.println("al is substring of al3");
		
//		if(al.contains("mn"))System.out.println("same object");
//		else System.out.println("not same");
		
//		al3.retainAll(al);
//		al3.removeAll(al);
//		System.out.println(al3.removeIf(filter->filter.contains("JAVA")));
//		System.out.println(al3.removeIf(filter->filter.equalsIgnoreCase("mn")));
//		System.out.println(al3.removeIf(filter->filter.endsWith("WORK")));
//		System.out.println(al3);
		
//		System.out.println(al3.hashCode());
//		
//		System.out.println(al3);
//		System.out.println(al3.size());
		
		
//		Iterator<String> iterator = al3.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next()+" ");
		
		//still here we hava covered all the collections methods and we also covered most of the List methods 
		//i.e, as List extends Collection so almost all the collection methods are available in the List too. 
		//from now we see only Method which are there in List and which are not there in collection.
		
//		System.out.println(al3);
//		ListIterator<String> listIterator = al3.listIterator();
//		while(listIterator.hasNext())
//			System.out.print(listIterator.next()+" ");
//		System.out.println();
//		while(listIterator.hasPrevious())
//			System.out.print(listIterator.previous()+" ");
//		
//		ListIterator<String> listIterator = al3.listIterator();
//		while(listIterator.hasNext()) {
//			System.out.print(listIterator.next()+" ");
//			System.out.print(listIterator.nextIndex()+" ");
//			System.out.print(listIterator.previousIndex()+" ");
//			System.out.println();
//			listIterator.remove();
//		}
//		ListIterator<String> listIterator = al3.listIterator(5);
//		while(listIterator.hasNext()) {
//			listIterator.add("123");
//			System.out.print(listIterator.next()+" ");
//			listIterator.remove();
//		}
		List<String> subList = al3.subList(0, 6);
		System.out.println(subList);
		System.out.println(al3);
		System.out.println(al3.size());
		
	}
	
}
