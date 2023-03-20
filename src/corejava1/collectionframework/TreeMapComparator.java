package corejava1.collectionframework;

import java.util.Comparator;

public class TreeMapComparator implements Comparator<Character>{

	@Override
	public int compare(Character o1, Character o2) {
		return o1.compareTo(o2);
	}

}
