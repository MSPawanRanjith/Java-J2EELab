
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		StringThread stringThread= new StringThread();
		NumberThread numberThread=new NumberThread();
		
		stringThread.start();
		Thread.sleep(5000);
		numberThread.start();

	}

}
