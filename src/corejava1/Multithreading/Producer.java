package corejava1.Multithreading;

public class Producer implements Runnable {
	private Stack stck;
	public Producer(Stack stck) {
		this.stck=stck;
		new Thread(this,"Producer").start();
		
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			stck.put(i++);
		}
		
	}

}
