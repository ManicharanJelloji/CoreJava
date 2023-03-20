package corejava1.lambda;

public class ConstructorDemo {
	static <R,T> R myclassFactory(MyFunc<R,T> cons,T v) {
		return cons.func(v);
	}
	public static void main(String[] args) {
		MyFunc<MyClass<?>,Integer> mycon=MyClass<Integer>::new;
		System.out.println(myclassFactory(mycon, 100).getVal());
//		MyClass<Integer> func=mycon.func(100);
//		System.out.println(func.getVal());
		
		MyFunc<MyClass<?>,String> mycon1=MyClass<String>::new;
		System.out.println(myclassFactory(mycon1, "CHARAN").getVal());
//		MyClass<String> func1=mycon1.func("MANI");
//		System.out.println(func1.getVal());
	}

}
