import java.util.Scanner;

public class Account {
	int mAccNo;
	String mName;
	int mPhNo;
	float mBalAmt;
	
	//Scanner Object
	Scanner scanner =new Scanner(System.in);
	
	public Account(int accNo,String name,int phNo,float balAmt) {
		mAccNo=accNo;
		mName=name;
		mPhNo=phNo;
		mBalAmt=balAmt;
		
	}
	
	public void deposit() {
		float amtDeposit;
		System.out.println("Enter the Amt to be deposited :");
		amtDeposit=scanner.nextFloat();
		mBalAmt+=amtDeposit;
	}
	
	public void withdraw() {
		float amtWithdraw;
		System.out.println("Enter the Amt to Withdrawn :");
		amtWithdraw=scanner.nextFloat();
		
		if (amtWithdraw>mBalAmt || mBalAmt<1){
			System.out.println("Enter Invalid amt, Balance is low");
			
		}
		else {
			mBalAmt-=amtWithdraw;
		}
		
	}
	
	public void  display() {
		System.out.println("Acc No : "+mAccNo+"\nAcc Name : "+mName+"\nPhNo : "+mPhNo+"\nAcc Bal : "+mBalAmt);
	}
}
