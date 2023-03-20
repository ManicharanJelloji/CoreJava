package corejava1.Exceptions;

public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=2;
			int b=36/a;
			int[] arr= {1,2};
			arr[88]=17;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		catch(ArithmeticException ex){
			System.out.println("division by zero: "+ex);
		}
				System.out.println("after try/catch block");

	}

}
