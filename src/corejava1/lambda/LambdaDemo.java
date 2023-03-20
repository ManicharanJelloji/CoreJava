package corejava1.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber num=()->123.4;
		System.out.println(num.getValue());
		MyNumber num1=()->Math.random()*2;
		System.out.println(num1.getValue());
		
		
//		NumericTest isEven=(n,m)->(n%m)==0;
//		if(isEven.test(10,2))
//			System.out.println("10 is even number");
//		if(!isEven.test(9,2))
//			System.out.println("9 is odd number");
//		isEven.defaultMethod();

		
		NumericTest isNotNeg=(m,n)->m>n;
		if(isNotNeg.test(10,2))
			System.out.println("m is greater than n");
		if(!isNotNeg.test(10,20))
			System.out.println("m is lesser than n");
	}
}
