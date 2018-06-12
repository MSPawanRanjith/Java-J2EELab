import java.util.Scanner;


public class NumberThread extends Thread {

	public void run(){
		String input;
		String[] number={"zero","one","two","three","four","five"};
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number :");
		input=scanner.next();
		
		if(input.length()>=4){
			for(char ch: input.toCharArray()){
				System.out.println(ch+" : "+number[Character.getNumericValue(ch)]);
			}
		}
		else{
			System.out.println("Less than 4");
		}
	}
}
