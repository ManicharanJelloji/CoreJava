package corejava1.Multithreading;

public class Consumer implements Runnable{
	private Stack stck;
	public Consumer(Stack stck) {
		this.stck=stck;
		new Thread(this,"Consumer").start();
		
	}
	@Override
	public void run() {
		while(true) {
			stck.get();
		}
		
	}

}
