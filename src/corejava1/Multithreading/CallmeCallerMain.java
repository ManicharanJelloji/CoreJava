package corejava1.Multithreading;

public class CallmeCallerMain {

	public static void main(String[] args) {
		Callme callme=new Callme();
		Caller caller1=new Caller(callme,"Hello");
		Caller caller2=new Caller(callme,"Synchronized");
		Caller caller3=new Caller(callme,"World");
		

	}

}
