package corejava1;

public class Box {
	private double width;
	private double length;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double volume() {
		System.out.print("Volume is ");
		return width*length*height;
	}
	
	void setValues(double width,double length, double height) {
		this.width=width;
		this.length=length;
		this.height=height;
	}
	Box(){
		System.out.println("Default constructor");
		width=-10;
		length=-20;
		height=-30;
	}
	public Box(double w,double l,double h){
		width=w;
		length=l;
		height=h;
	}
	

}
