package corejava1.Generics;

public class MinMaxImpl<T extends Comparable<T> > implements MinMax<T> {
	T[] vals;
	public MinMaxImpl(T[] vals) {
		this.vals=vals;
	}

	@Override
	public T min() {
		T min=vals[0];
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(min)<0)
				min=vals[i];
		return min;
	}

	@Override
	public T max() {
		T max=vals[0];
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(max)>0)
				max=vals[i];
		return max;
	}
	public static void main(String[] args) {
		Integer nums[]= {12,45,7,63,98};
		MinMaxImpl<Integer> MM=new MinMaxImpl<>(nums);
		System.out.println(MM.min());
		Character ch[]= {'D','e','F','A','b','C',};
		MinMaxImpl<Character> MM1=new MinMaxImpl<>(ch);
		System.out.println(MM1.max());
	}

}
