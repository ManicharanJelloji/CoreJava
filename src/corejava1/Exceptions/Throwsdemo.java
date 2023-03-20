package corejava1.Exceptions;

public class Throwsdemo {
	public static void main(String[] args) {
		try{
			throwone();
		}
		catch(Myexception ex) {
			System.out.println("from Myexception:" +ex);
		}
	}

	private static void throwone(){
		// TODO Auto-generated method stub
		throw new Myexception("custom Exception");
//		throw new IllegalAccessException("AccessException");
	}

}
