package corejava1.lambda;

public class MyStringOps {
	 String stringrev(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--)
			res+=str.charAt(i);
		return res;
	}

}
