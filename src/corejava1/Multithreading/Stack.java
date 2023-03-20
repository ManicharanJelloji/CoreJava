package corejava1.Multithreading;

public class Stack {
	private int n;
	boolean valueSet=false;
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Get: "+ n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		this.n=n;
		valueSet=true;
		notify();
		System.out.println("put: "+n);
	}

}
