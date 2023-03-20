package corejava1.Generics;

import corejava1.Box;

public class NonGenerics {
	Object obj;
	public NonGenerics(Object oj) {
		obj=oj;
	}
	
	Object getobj() {
		return obj;
	}
	void showType() {
		System.out.println("the obj Type is: "+ obj.getClass().getName());
	}
	public static void main(String[] args) {
		NonGenerics ng=new NonGenerics(45);
//		int value=(int) ng.getobj();
		System.out.println(ng.getobj());
		ng.showType();
		
		NonGenerics ng1=new NonGenerics("String parameter");
		String value1= (String) ng1.getobj();
		System.out.println(value1);
		ng1.showType();
		
		Box box=new Box(12.56,3.78,45.79);
		NonGenerics ng2=new NonGenerics(box);
		Box value2= (Box) ng2.getobj();
		System.out.println(value2.volume());
		ng2.showType();
	}

}
