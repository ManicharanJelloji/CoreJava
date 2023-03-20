 package corejava1.collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Double> pq=new PriorityQueue<>();
		//by Default we can insert upto 11 element, after 11 elements it will automatically grow the size
		pq.add(54.86);
		pq.add(12.45);
		pq.add(96.84);
		pq.add(43.56);
		pq.add(75.13);
		System.out.println(pq);
		TreeSet<Double> ts= new TreeSet<>();
		ts.add(78.1);
		ts.add(148.6);
		ts.add(85.7);
		ts.add(65.7);
		System.out.println(ts);
		pq.addAll(ts);
		System.out.println(pq);
//		Iterator<Double> iterator = pq.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next()+"  ");
//		Object[] arr = pq.toArray();
//		for(Object arr:pq.toArray())
//			System.out.print(arr+" ");
		
//		pq.remove();
//		pq.remove(65.7);
		pq.retainAll(ts);
		System.out.println(pq);
		
		
		
		
		
		
		
		
		
		
	}
}
