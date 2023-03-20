package corejava1.Multithreading;

public class ThreadMain {
	public static void main(String[] args) {
		ExtendThread thread1=new ExtendThread("one");
		ExtendThread thread2=new ExtendThread("two");
		ExtendThread thread3=new ExtendThread("three");
		System.out.println("thread one isAlive " + thread1.isAlive());
		System.out.println("thread two isAlive " + thread2.isAlive());
		System.out.println("thread three isAlive " + thread3.isAlive());
		try {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread() +"i value :"+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("thread one isAlive " + thread1.isAlive());
		System.out.println("thread two isAlive " + thread2.isAlive());
		System.out.println("thread three isAlive " + thread3.isAlive());
	}

}
