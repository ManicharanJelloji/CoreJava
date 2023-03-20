package corejava1.Generics;

public class TwoGen<R, G> {
	R obj1;
	G obj2;
	public TwoGen(R o1,G o2) {
		obj1=o1;
		obj2=o2;
	}
	R getobj1() {
		return obj1;
	}
	G getobj2() {
		return obj2;
	}
	void Showtype() {
		System.out.println("R type: "+ obj1.getClass().getName());
		System.out.println("G type: "+ obj2.getClass().getName());
	}
	public static void main(String[] args) {
		TwoGen<Integer, String> tg=new TwoGen<>(88, "string parameter");
		tg.Showtype();
		int value1=tg.getobj1();
		String value2=tg.getobj2();
		System.out.println(value1);
		System.out.println(value2);
	}

}
