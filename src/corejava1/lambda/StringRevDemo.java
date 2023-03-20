package corejava1.lambda;

public class StringRevDemo {
	public static void main(String[] args) {
		StringRev reverse=(String str)->{
			String res="";
			for(int i=str.length()-1;i>=0;i--)
				res+=str.charAt(i);
			return res;
		};
		System.out.println("After reverse:"+reverse.func("ABBA"));
	}

	
}
