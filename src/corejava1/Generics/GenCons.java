
package corejava1.Generics;

public class GenCons {
	private double val;
	private String val1;
	public <T extends Number,A > GenCons(T org, A a) {
		val=org.doubleValue();
		val1=a.toString();
//		System.out.println(org+" "+ a);
	}
	void showval() {
		System.out.println("val:"+val+" "+val1);
	}
	public static void main(String[] args) {
		GenCons gc=new GenCons(12,"String");
		
		gc.showval();
		GenCons gc1=new GenCons(12,"mani");
		gc1.showval();
	}

}
