package corejava1.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreaderRead {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character");
		String c;
		do {
			c=reader.readLine();
			System.out.println(c);
		}while(c.equals("stop"));
	}

}
