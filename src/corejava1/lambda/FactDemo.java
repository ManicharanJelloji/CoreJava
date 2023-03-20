package corejava1.lambda;

public class FactDemo {

	public static void main(String[] args) {
		GenericsFunInt<Integer> Factorial=(n)->{
			int res=1;
			for(int i=1;i<=n;i++)
				res=i*res;
			return res;
		};
		System.out.println(Factorial.func(2));
		System.out.println(Factorial.func(3));
		System.out.println(Factorial.func(4));
		System.out.println(Factorial.func(5));
	}

}
