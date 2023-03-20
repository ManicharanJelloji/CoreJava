package corejava1;

public class Stack {
	private int stck[];
	private int tos;
	private int size;
	
	public Stack(int size) {
		stck =new int[size];
		tos=-1;
		this.size=size;
	}
	
	void push(int item) {
		if(tos==stck.length-1) {
			System.out.println("stack is full");
		}
		else {
			stck[++tos]=item;
		}
	}
	int pop() {
		if(tos<0) {
			System.out.println("stack is underflow");
			return 0;
		}
		else 
			return stck[tos--];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
