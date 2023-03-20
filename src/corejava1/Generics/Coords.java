package corejava1.Generics;

public class Coords<T extends TwoD> {
	T[] coords;
	public Coords(T[] o) {
		coords=o;
	}
	static void showXY(Coords<? extends TwoD> c) { 
		System.out.println("X Y values :");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x+ " ,"+ c.coords[i].y);
//		System.out.println();
		}
	}
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y Z values :");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x+ " ,"+ c.coords[i].y+" ,"+c.coords[i].z);
//		System.out.println();
		}
	}
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X Y Z W values :");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x+ " ,"+ c.coords[i].y+" ,"+c.coords[i].z+" ,"+c.coords[i].w);
//		System.out.println();
		}
	}
	public static void main(String[] args) {
//		Coords<?> mani=new Coords<>(null);
		TwoD tarr[]=new TwoD[3];
		tarr[0]=new TwoD(12,13);
		tarr[1]=new TwoD(13,14);
		tarr[2]=new TwoD(15,16);
		Coords<TwoD> td=new Coords<TwoD>(tarr);
		showXY(td);
		
		ThreeD tharr[]=new ThreeD[3];
		tharr[0]=new ThreeD(12,13,14);
		tharr[1]=new ThreeD(13,14,15);
		tharr[2]=new ThreeD(15,16,17);
		Coords<ThreeD> td1=new Coords<ThreeD>(tharr);
		showXYZ(td1);
		
		FourD farr[]=new FourD[3];
		farr[0]=new FourD(12,13, 14, 15);
		farr[1]=new FourD(13,14, 15, 16);
		farr[2]=new FourD(14,15, 16, 17);
		Coords<FourD> td2=new Coords<FourD>(farr);
		Coords.showAll(td2);
		showAll(td2);
	}

}
