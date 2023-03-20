package corejava1.lambda;

public class LambdaasArgument {
	
	static String parameter(StringRev sr, String str) {
		return sr.func(str);
		
	}

	public static void main(String[] args) {
//		String instr="lambda add power to java";
		String outstr="";
//		System.out.println("the instr is:  "+ instr);
//		outstr=parameter((String str)->{
//			String res="";
//			for(int i=str.length()-1;i>=0;i--)
//				res+=str.charAt(i);
//			return res;
//			},instr);
//		System.out.println("the outstr is:  " +outstr);
		String instr1="Java is powerful because of lambda";
		System.out.println("the instr is:  "+ instr1);
		MyStringOps ops=new MyStringOps();
		
		
		outstr=parameter(ops::stringrev,instr1);
		System.out.println("the outstr is:  " +outstr);
	}

}
