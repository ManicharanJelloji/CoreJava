package corejava1.collectionframework;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>();
		lhm.put('L', 121);
		lhm.put('I', 122);
		lhm.put('N', 123);
		lhm.put('K', 124);
		System.out.println(lhm.get('K'));
		System.out.println(lhm.containsKey('K'));
		System.out.println(lhm.containsValue(123));
//		lhm.remove('N');
		Set<Character> keySet = lhm.keySet();
		System.out.println(keySet);
		System.out.println(lhm);
	}

}
