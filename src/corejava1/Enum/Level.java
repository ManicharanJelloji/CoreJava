package corejava1.Enum;

public enum Level {
	LOW(10,"first"),MEDIUM(15,"second"),HIGH(20,"third");
	private int price;
	private String msg;
	Level(int price,String msg){
		this.price=price;
		this.msg=msg;
	}
	
	int getPrice() {
		return price;
	}
	String getMsg() {
		return msg;
		
	}

	

}
