package corejava1.collectionframework;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Character> ad=new ArrayDeque<>();
		//public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
		//default capacity is 16
		ad.add('A');
		ad.add('B');
		ad.add('C');
		//when we call add method its internally calling addLast method
//		ad.addLast('D');
		ad.offerLast('D');
		//when we call offerLast it's internally calling addLast Method, But the difference between addLast and OfferLast is 
		//return type of addLast is Void(it will return nothing also addLast method Throw exception) and return type of offerLast is boolean(It will return true or false)
//		ad.offer('o');
		//when  we call offer method its internally calling offerLast Method and offerLast Internally calling addLast Method
		//Also if we see all the methods in Deque interface there is a addLast method
//		ad.addFirst('D');
		//This method is adding at last index of the Default size i.e,16 but it will add the element in the first position because DeqIterator() { cursor = head; } so first it will print the Head i.e last value and later the cursor goes to 0.
		ad.offerFirst('F');
		ad.offerFirst('G');
		
		System.out.println(ad);
//		System.out.println(ad.pollFirst());//it's removing first element
//		System.out.println(ad.pollLast());//it remove last element
		System.out.println(ad.getFirst());
		//getFirst method differs from peekFirst only in that it throws an exception if this deque is empty.
		System.out.println(ad.getLast());
		//This method differs from {@link #peekLast peekLast} only in that it throws an exception if this deque is empty.
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad);
		//No one is losing Nothing, you are the one who is losing something either energy,time or money.
	}

}
