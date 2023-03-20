package corejava1;

public class Triangle extends Figure{

	public Triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	Double area() {
		// TODO Auto-generated method stub
		return getDim1()*getDim2()*2;
	}

}
