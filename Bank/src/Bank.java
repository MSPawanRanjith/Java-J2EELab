import java.util.ArrayList;
import java.util.Scanner;



public class Bank {

	static ArrayList<Account> mAccDetails=new ArrayList<Account>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ch=true;
		int accNo,phNo;
		float balAmt;
		String name;
		Scanner scanner =new Scanner(System.in);
		while(ch) {
			System.out.println("Enter AccNo, Name, PhNo, Balance");
			accNo=scanner.nextInt();
			name=scanner.next();
			phNo=scanner.nextInt();
			balAmt=scanner.nextFloat();
			
			Account accObj= new Account(accNo, name, phNo, balAmt);
			mAccDetails.add(accObj);
			System.out.println("Do U want to enter next record : ");
			ch=scanner.nextBoolean();
		}
		
		for(Account a: mAccDetails){
			if (a.mBalAmt<1000){
				System.out.println("------------------------------------------------------");
				a.display();
				System.out.println("------------------------------------------------------");
			}
			else {
				a.display();
			}
		}
		ch=true;
		while(ch){
			Account currAccount=null;
			System.out.println("Eneter AccNo to operate : ");
			int _accNo=scanner.nextInt();
			for(Account a: mAccDetails){
				if(a.mAccNo==_accNo){
					currAccount=a;
				}
				
			}
			System.out.println("Enter the choice 1,2,3");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				currAccount.deposit();
				currAccount.display();
				break;
			case 2:
				currAccount.withdraw();
				currAccount.display();
			default:
				ch=scanner.nextBoolean();
			}
		}
	}

}
