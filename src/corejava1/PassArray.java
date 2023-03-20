package corejava1;

public class PassArray {
	static void vaTest(int ...v) {
		System.out.print("No. of args :"+ v.length + " content is:");
		for(int x : v) {
			System.out.print(x+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * int n1[]= {10}; int n2[]= {10,20,30,40,50}; int n3[]= {};
		 */
		vaTest(10);
		vaTest(10,20,30);
		vaTest();
	}

}
