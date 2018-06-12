package studentpackage;

public class InvalidSGPA extends Exception {

	private static final long serialVersionUID = 1L;
	String mExcept;
	public InvalidSGPA(String except) {
		mExcept=except;
	}

	@Override
	public String toString(){
		return mExcept;
	}

}
