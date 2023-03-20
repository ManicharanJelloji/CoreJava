package corejava1;

public class Autoboxing {

	public static void main(String[] args) {
		int a=100;
//		Integer i=Integer.valueOf(a);
		Integer i=new Integer(a);
		int value=i.intValue();
		System.out.println(i);
		System.out.println(value);

	}

}
