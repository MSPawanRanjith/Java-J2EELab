
public class Call {
	int mPhNo;
	String mName;
	String mTime;
	
	public Call(int phNo,String name,String time) {
		mPhNo=phNo;
		mName=name;
		mTime=time;
	}

	public void display() {
		System.out.println("\nPhone No : "+mPhNo+"\nName : "+mName+"\nTime : "+mTime);
	}
}
