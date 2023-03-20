package corejava1.lambda;

public class LambdaExceptionsDemo {
	public static void main(String[] args) throws EmptyArrayException {
		double dnums[]= {10.2,15.63,48.75,76.34};
//		double sum=0.0;
		LambdaException arrayfunc=(n)->{
			double sum=0.0;
			if(n.length==0) 
				throw new EmptyArrayException();
			else
				for(int i=0;i<n.length;i++)
					sum+=n[i];
			return sum;
		};
		
		System.out.println("The sum of no. is:"+arrayfunc.func(dnums));
		System.out.println("The sum of no. is:"+arrayfunc.func(new double[0]));
	}

}
