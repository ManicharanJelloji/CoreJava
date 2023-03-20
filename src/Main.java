import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y;
		double z;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the x: ");
		x= scanner.nextDouble();
		
		System.out.println("Enter the y: ");
		y= scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);	
		

	}

}
