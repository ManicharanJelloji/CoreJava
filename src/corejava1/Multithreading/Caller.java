package corejava1.Multithreading;

public class Caller implements Runnable {
	private String msg;
	private Callme target;
	private Thread t;
	
	public Caller(Callme callme,String msg) {
		target=callme;
		this.msg=msg;
		t=new Thread(this);
		t.start();
		
	}

	@Override
	public void run() {
		target.call(msg);
		
	}

}
