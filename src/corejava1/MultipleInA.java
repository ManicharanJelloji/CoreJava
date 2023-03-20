package corejava1;

public interface MultipleInA {
	default double area(double a,double b) {
		return a*b;
	}
	static void show() {
		System.out.println("default show method for multipleA");
	}

}
