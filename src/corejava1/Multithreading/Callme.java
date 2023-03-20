package corejava1.Multithreading;

public class Callme {
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
			
		}
		System.out.println("]");
	}

}
