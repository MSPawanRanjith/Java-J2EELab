import java.util.Scanner;


public class StringThread extends Thread {
	
	public void run(){
		String input;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String for vowel");
		input=scanner.next();
		
		String vowel="aeiouAEIOU";
		int c=0;
		for(char ch: input.toCharArray()){
			if(vowel.contains(Character.toString(ch))){
				c++;
				System.out.println("Vowel : "+ch);
			}
		}
		System.out.println("TOTAL : "+c);
		
	}
}
