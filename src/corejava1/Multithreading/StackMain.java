package corejava1.Multithreading;

public class StackMain {

	public static void main(String[] args) {
		Stack stck=new Stack();
		new Producer(stck);
		
		new Consumer(stck);

	}

}
