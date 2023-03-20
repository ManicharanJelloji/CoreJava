package corejava1;

public class OverLoadDemo {
	void test() {
		System.out.println("No parameter");
	}
	void test(int a) {
		System.out.println("a value is :"+ a);
	}
	void test(int a,int b) {
		System.out.println(a+b);
	}
	void test(double a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		OverLoadDemo demo=new OverLoadDemo();
		demo.test();
		demo.test(10);
		demo.test(20,30);
		demo.test(50.0);
	}

}
