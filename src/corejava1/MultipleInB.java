package corejava1;

public interface MultipleInB {
	default double area(double a,double b) {
		return a*b/2;
	}
	default void show() {
		System.out.println("default show method for multipleB");
	}

}
