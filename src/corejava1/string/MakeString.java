package corejava1.string;

public class MakeString {

	public static void main(String[] args) {
		/*char ch[]= {'J','A','V','A'};
		byte barr[]= {65,66,67,68,69};
		String str=new String(ch, 3, 1);
		String str1=new String(str);
		String str2=new String(barr,0,barr.length-2);
//		System.out.println(str);
		System.out.println(str2);*/
		
		/*String age="9";
		int age=19;
		double age=32.1;
		String s="He is "+ age +" Years old.";
		System.out.println(s.charAt(s.length()-6));
		char ch=(char)"He is 10 Years old.".charAt(7);
		System.out.println(ch);
		String str="abcdef";//object creation using string literal
		String str1=new String("abcdef");//regular object creation 
		System.out.println(str+" "+ str1);*/
		
		
		/*String str="abcdef";
		char[] ch=new char[str.length()];
		System.out.println(ch);
		str.getChars(0, str.length(), ch, 0);
//		str.getBytes(0, str.length(), ch, 0);
		System.out.println(ch);*/
		
		/*String s="four: " +(2+2);
		System.out.println(s);
		System.out.println(String.valueOf(false));
		char ch[]= {'J','A','V','A'};
		System.out.println(String.valueOf(ch));
		System.out.println(String.copyValueOf(ch));//String str=new String(ch); both are same
		String s1="string";
		String s2=String.valueOf(ch);
		System.out.println(String.format("this is %s ",s1));
		System.out.println(String.format("this is %.8f ",54.75869));
		System.out.println(String.format("this is %.3f ",54.75869));
		System.out.println(String.format("this is %1$s,%2$s ",s2,s1));
		String msg=String.join("-", "java","is","cool");
		String msg1=String.join("'s ", "java","is","cool");
		System.out.println(msg);
		System.out.println(msg1);*/
		
		
		/*char ch[]= {'J','A','V','A'};
		String str=new String(ch);
		char[] charArray=str.toCharArray();
//		System.out.println(charArray);
		for(char charArray :str.toCharArray() ) {
			System.out.print(charArray+ " ");
		}*/
		
//		String s1="Hello";
//		String s2="Hello";
//		String s3="Hello World";
//		String s4="HELLO";
		
		/*System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		if(s2.startsWith("H"))System.out.println("the string starts with HE ");
		if(s2.endsWith("lo"))System.out.println("the string starts with LOL ");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);*/
		
		/*
		System.out.println(s1.indexOf("H"));
		System.out.println(s3.indexOf('W', 3));
		System.out.println(s1.lastIndexOf("l"));*/
		
		
		/*String org=" this is a test. this is a string ";
		String s=org.substring(0,15);
		System.out.println(s);
		System.out.println(s.concat(" this is second string.").concat(" this is third string"));
		String str=org.replace('t', 'T'); 
		System.out.println(str);
		System.out.println(org.trim());
		System.out.println(org+"this is second string.");*/
		
		
		
	}

}
