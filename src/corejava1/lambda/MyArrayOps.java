package corejava1.lambda;

public class MyArrayOps {
	static <T> int countMatching(T[] vals, T v) {
		int count=0;
		for(int i=0;i<vals.length;i++)
			if(vals[i]==v)count++;
		return count;
	}
	static <T> int countM(GenMR<T> mr,T[] vals, T v) {
		return mr.func(vals, v);
		
	}
	public static void main(String[] args) {
		Integer inArr[]= {10,20,30,10,20,30,10,40};
		String strArr[]= {"AB","BC","CD","AB","BC","CD","AB"};
		System.out.println(countM(MyArrayOps::countMatching, inArr,10));
		System.out.println(countM(MyArrayOps::countMatching, strArr,"BC"));
	}

}
