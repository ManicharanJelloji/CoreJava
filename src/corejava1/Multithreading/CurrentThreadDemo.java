package corejava1.Multithreading;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread currentThread=Thread.currentThread();
		System.out.println("current Thread: "+ currentThread);
		currentThread.setName("current thread");
		System.out.println("current Thread: "+ currentThread);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("i value :"+ i + " ");
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
