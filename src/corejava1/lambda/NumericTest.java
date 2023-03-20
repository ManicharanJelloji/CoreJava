package corejava1.lambda;

public interface NumericTest {
	boolean test(int m,int n);
	default void defaultMethod() {
		System.out.println("this is the default method");
	}
}
