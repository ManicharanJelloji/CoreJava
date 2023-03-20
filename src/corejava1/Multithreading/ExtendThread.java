package corejava1.Multithreading;

public class ExtendThread extends Thread {
	public String name;
	public ExtendThread(String name) {
		super(name);
		this.name=name;
		System.out.println("child thread: "+this);
		start();
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(name +" i value :"+ i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
