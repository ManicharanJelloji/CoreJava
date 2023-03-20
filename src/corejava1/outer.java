package corejava1;

public class outer {
	int outer_x=100;
	
	static void test() { 
		System.out.println("Inside outer method");
	}
	static class Inner{
		public static void display() {
			System.out.println("Inside inner class method");
			test();
		}
	}
	

	

}
