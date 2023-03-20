package corejava1.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Stringbuffer");
		System.out.println(buffer.append(" append").append(" append").append(" Final append"));
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		buffer.setLength(45);
		System.out.println(buffer.length());
		System.out.println(buffer.charAt(39));
		buffer.setCharAt(39, 's');
		buffer.setCharAt(44, 's');
		System.out.println(buffer);
//		buffer.ensureCapacity(100);
//		System.out.println(buffer.capacity());
//		StringBuilder
		
//		char[] ch=new char[50];
//		buffer.getChars(3, 45, ch, 0);
//		for(char cha:ch)
//			System.out.print(cha+" ");
		
//		System.out.println(buffer.length());
//		System.out.println(buffer.insert(42, 'L'));
//		System.out.println(buffer.insert(42, "False"));
//		System.out.println(buffer.length());
//		System.out.println(buffer.capacity());
//		
//		System.out.println(buffer.reverse());
		System.out.println(buffer);
		System.out.println(buffer.delete(35, buffer.length()));
		System.out.println(buffer.deleteCharAt(5));
		System.out.println(buffer.substring(20));
		System.out.println(buffer.substring( 0, 10));
	}

}
