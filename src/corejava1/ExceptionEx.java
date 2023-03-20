package corejava1;

public class ExceptionEx {
	
	static void show() {
		try {
			int a=0;
			int b=43;
			System.out.println(b/a);
		}
		catch(ArithmeticException ex) {
			System.out.println("division by zero");
		}
	}
	
	public static void main(String[] args) {
		show();
	}

}
