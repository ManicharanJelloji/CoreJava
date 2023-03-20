package corejava1.Enum;

public class EnumDemo {
	public static void main(String[] args) {
		Level le;
		le=Level.HIGH;
		System.out.println("Value of level:"+le);
		if(le==Level.HIGH) {
			System.out.println("Value of level in If:"+le);
		}
		switch(le){
		case LOW:
			System.out.println("case LOW constraints");
			break;
		case HIGH:
			System.out.println("case HIGH constraints");
			break;
		case MEDIUM:
			System.out.println("case MEDIUM constraints");
			break;
			default:
				System.out.println("default case");
		}
		for(Level l:Level.values()) {
			System.out.println(l.getPrice());
		}
		Level value=Level.valueOf("HIGH"); 
		System.out.println(value.getMsg());
	}

	

}
