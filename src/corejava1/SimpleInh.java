package corejava1;

public class SimpleInh {
	
	public static void main(String[] args) {
		
		InhA ina=new InhA();
		InhB inb=new InhB();
		
		ina.i=10;
		ina.j=20;
		
		inb.i=25;
		inb.j=30;
		inb.k=35;
		
		ina.showIJ();
		inb.showIJ();
		inb.showK();
		inb.sum();
		
	}

}
