package corejava1.Exceptions;

public class Myexception extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Myexception() {
		super();
	}
	
	public Myexception(String mess) {
		super(mess);
	}

}
