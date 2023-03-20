package corejava1.Generics;

import corejava1.Box;

public class Gen<T> {
	T obj;
	public Gen(T obj) {
		this.obj=obj;
	}
	T getObj() {
		return obj;
	}
	void Showtype() {
		
		System.out.println("T type: "+ obj.getClass().getName());
	}
	public static void main(String[] args) {
		Gen<Integer> obj=new Gen<>(99);
		int value=obj.getObj();
		System.out.println(value);
		obj.Showtype();
		
		Gen<String> obj1=new Gen<>("Generic String");
		String value1=obj1.getObj();
		System.out.println(value1);
		obj1.Showtype();
		
		Gen<Character> obj2=new Gen<>('M');
		Character value2=obj2.getObj();
		System.out.println(value2);
		obj2.Showtype();
		
		Gen<Boolean> obj3=new Gen<>(false);
		Boolean value3=obj3.getObj();
		System.out.println(value3);
		obj3.Showtype();
		
		Box box=new Box(56.7,38.5,38.9);
		Gen<Box> gBox=new Gen<>(box);
		Box value4=gBox.getObj();
		System.out.println(value4.getHeight()+" "+value4.getLength()+" "+value4.getWidth());
		gBox.Showtype();
	}

}
