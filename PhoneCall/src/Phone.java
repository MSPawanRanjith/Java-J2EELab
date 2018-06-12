import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Phone {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		HashMap<Integer,String> callerList=new HashMap<Integer,String>();
		System.out.println("Enter the phone Book details : ");
		
		for(int i=0;i<3;i++){
			System.out.println("Enter Number, Name : ");
			Integer num=scanner.nextInt();
			String name=scanner.next();
			callerList.put(num, name);
		}
		
		int ch=0;
		int i=0;
		
		ArrayList<Call> missedCall=new ArrayList<Call>();
		
		System.out.println("Enter the missed call detaisl :");
		while(ch!=2){
			System.out.println("1. Enter 2.Exit");
			ch=scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the number, Time : ");
				int num=scanner.nextInt();
				String time=scanner.next();
				String name="Private Caller";
				if(callerList.containsKey(num)){
					name=callerList.get(num);
				}
				Call call =new Call(num, name, time);
				try{
					missedCall.set(i,call);
				}
				catch (Exception e) {
					missedCall.add(call);
				}
				finally{
					i=(i+1)%10;
				}
				break;
			case 2:
				break;
			}
		}
		System.out.println("Missed Calls : ");
		ArrayList<Call> missedCallAlter=new ArrayList<Call>();
		missedCallAlter.addAll(missedCall);
		for (Call call : missedCallAlter) {
			System.out.println(call.mPhNo);
			System.out.println("1.Delete 2.Next 3.Details");
			ch=scanner.nextInt();
			switch (ch) {
			case 1:
				missedCall.remove(call);
				break;
			case 2:
				break;
			case 3:
				call.display();
				break;
			default:
				break;
			}
		}
		
	}

}
