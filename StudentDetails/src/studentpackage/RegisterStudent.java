package studentpackage;

import java.util.Scanner;

import resultpackage.ShowResults;



public class RegisterStudent implements Student {

	public String name,branch;
	public int[] credits=new int[3];
	public int[] prevCredits=new int[9];
	public int[] marks=new int[3];
	public int[] prevMarks=new int[9];
	public float semTot,total,sgpa,cgpa;
	public int totCredit=0;
	
	Scanner scanner=new Scanner(System.in);

	@Override
	public void getDetails() {
		System.out.println("Enter the Name and Branch");
		name=scanner.next();
		branch=scanner.next();
		System.out.println("Enter the credits for three sub :");
		for (int i = 0; i < 3; i++) {
			credits[i]=scanner.nextInt();
			totCredit+=credits[i];
			try{
				if(totCredit>30){
				
					throw new CreditLimitException("More than 30 !");
				}
			}
			catch (CreditLimitException e) {
					System.out.println(e);
					System.exit(0);
			}
		}
		calculateSGPA();
			
			
	}
	
	public void calculateSGPA() {
		System.out.println("Get Marks :");
		for(int i=0;i<3;i++){
			System.out.println("Enter marks of subject"+(i+1));
			marks[i]=scanner.nextInt();
			semTot += marks[i]*credits[i];
		}
		sgpa=(float)semTot/totCredit;
		try{
			if (sgpa>10) {
				throw new InvalidSGPA("Marks entered is wrong, SGPA>10");
			}
		}
		catch(InvalidSGPA e){
			System.out.println(e);
			System.exit(0);
		}
		ShowResults.display(marks, credits, sgpa);
		calculateCGPA();
	}
	
	public void calculateCGPA() {
		System.out.println("Get Marks of previous :");
		for(int i=0;i<9;i++){
			System.out.println("Enter credits and marks of subject"+(i+1));
			prevCredits[i]=scanner.nextInt();
			totCredit+=prevCredits[i];
			prevMarks[i]=scanner.nextInt();
			total += prevMarks[i]*prevCredits[i];
		}
		cgpa=(float)total/totCredit;
		ShowResults.display(prevMarks,prevCredits , cgpa);
	}

}


