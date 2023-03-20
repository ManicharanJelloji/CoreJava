package corejava1.Generics;

public class IsINclass {
	<T extends Comparable<T>,V extends T> boolean IsIn(T x,V[] y) {
		for(int i=0;i<y.length;i++)
			if(x.equals(y[i])) return true;
		return false;
	}
	public static void main(String[] args) {
		Integer nums[]= {13,25,67,35,90};
		String str[]= {"one","two","three","four","five","six"};
		IsINclass obj=new IsINclass();
		System.out.println(obj.IsIn(13, nums));
		System.out.println(obj.IsIn("seven", str));
	}

}
