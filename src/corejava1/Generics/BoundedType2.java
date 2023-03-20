package corejava1.Generics;

import corejava1.Box;

public class BoundedType2<Z extends Box> {
	private Z obj;
	
	public BoundedType2(Z obj) {
		this.obj=obj;
	}
	double Vol() {
		return obj.volume();
	}
	public static void main(String[] args) {
		Box box=new Box(23,56,98);
		BoundedType2<Box> bt2=new BoundedType2<>(box);
		System.out.println(bt2.Vol());
		
	}
	

}
