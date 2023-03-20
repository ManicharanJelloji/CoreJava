package corejava1.collectionframework;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Character, Float> tm=new TreeMap<>(new TreeMapComparator());
		tm.put('C',45.01f);
		tm.put('H',78.02f);
		tm.put('A',12.3f);
		tm.put('R',36.4f);
		tm.put('A',25.5f);
		tm.put('C',14.6f);
		tm.put('T',69.7f);
		tm.put('E',58.8f);
		tm.put('R',47.9f);
		//tm.putAll(lhm);
//		SortedMap<Character, Float> subMap = tm.subMap('A', 'E');
//		System.out.println(subMap);
//		SortedMap<Character, Float> headMap = tm.headMap('R');
//		System.out.println(headMap);
		
//		SortedMap<Character, Float> subMap = tm.subMap('A',true, 'E',true);//NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey,   boolean toInclusive);
//		System.out.println(subMap);
//		SortedMap<Character, Float> headMap = tm.headMap('R',true);//NavigableMap<K,V> headMap(K toKey, boolean inclusive);         
//		System.out.println(headMap);
		
//		System.out.println(tm.tailMap('H',true));
//		System.out.println(tm.tailMap('H',false));
		
//		System.out.println(tm.firstKey());
//		System.out.println(tm.lastKey());
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.keySet());
//		System.out.println(tm.values());
//		System.out.println(tm.entrySet());
		System.out.println(tm);
//		System.out.println(tm.pollFirstEntry());//it's removing the first entry
//		System.out.println(tm.pollLastEntry());//it's removing the last entry
//		System.out.println(tm.descendingKeySet());
//		System.out.println(tm.descendingMap());
//		System.out.println(tm.navigableKeySet());
//		System.out.println(tm.lowerEntry('R'));//print left value/lower value
//		System.out.println(tm.lowerEntry('A'));//<
//		System.out.println(tm.floorEntry('B'));//<=
		System.out.println(tm.ceilingEntry('S'));//>=
		System.out.println(tm.higherEntry('T'));//>
		System.out.println(tm);
	}
}
