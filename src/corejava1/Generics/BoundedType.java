package corejava1.Generics;

public class BoundedType<T extends Number> {
	T[] nums;
	public BoundedType(T[] o) {
		nums=o;
	}
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	boolean sameAvg(BoundedType<?> ob) {
		if(average()==ob.average())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Double[] nums1= {1.45,2.78,3.34,4.90,5.34,6.45};
		BoundedType<Double> bt=new BoundedType<>(nums1);
		System.out.println(bt.average());
		
		Integer[] nums= {1,2,3,4,5,6};
		BoundedType<Integer> bt1=new BoundedType<>(nums);
		System.out.println(bt1.average());
		
		
		
		System.out.println(bt.sameAvg(bt1));
	}

}
