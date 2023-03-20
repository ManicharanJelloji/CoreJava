package corejava1.collectionframework;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<>();
		hm.put("KEY", 12.01);
		hm.put("HASH", 43.56);
		hm.put("MAP", 76.83);
		System.out.println(hm.get("MAP"));
		System.out.println(hm.containsKey("Hash"));
		System.out.println(hm.containsValue(76.8368));
//		hm.remove("MAP");
		Set<String> keySet = hm.keySet();
		System.out.println(keySet);
		System.out.println(hm);
	}

}
