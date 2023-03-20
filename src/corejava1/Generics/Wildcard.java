package corejava1.Generics;

public class Wildcard<T> {
	T obj;
	public Wildcard(T ob) {
		obj=ob;
	}
	boolean wildcardArgument(Wildcard<?> ob) {
		if(this==ob) return true;
		else return false;
	}
	public static void main(String[] args) {
		Wildcard<Integer> wc=new Wildcard<Integer>(45);
		Wildcard<Double> wc1=new Wildcard<Double>(45.0);
		Wildcard<String> wc2=new Wildcard<String>("MAni");
		Wildcard<String> wc4=new Wildcard<String>("MAni");
		Wildcard<Integer> wc3=wc;
		System.out.println(wc2.wildcardArgument(wc4));
		
		
	}

}
