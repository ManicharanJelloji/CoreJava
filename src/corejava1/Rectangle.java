package corejava1;

public class Rectangle extends Figure {

	public Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	Double area() {
		// TODO Auto-generated method stub
		return getDim1()*getDim2();
	}

	

}
