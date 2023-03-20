package corejava1.lambda;

public class MyClass<T> {
	private T val;
	
	public MyClass(T v) {
		val=v;
	}
	public MyClass() {
		val=null;
	}
	T getVal() {
		return val;
	}

}
