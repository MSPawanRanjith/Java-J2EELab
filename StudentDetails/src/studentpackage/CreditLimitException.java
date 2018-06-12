package studentpackage;

public class CreditLimitException extends Exception {
	
	private static final long serialVersionUID = 1L;
	String mExcept;
	public CreditLimitException(String except){
		mExcept=except;
	}
	
	@Override
	public String toString (){
		return mExcept;
	}

}
