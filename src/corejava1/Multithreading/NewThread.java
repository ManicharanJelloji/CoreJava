package corejava1.Multithreading;

public class NewThread implements Runnable{
	public Thread t;
	public NewThread() {
		t=new Thread(this,"demo Thread");
		t.setPriority(10);
		System.out.println("child thread: "+ t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t +"i value :"+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}

}
