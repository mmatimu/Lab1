import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter Years To Work
		System.out.print("Enter Years To Work: ");
		int YearsToWork = input.nextInt();
		
		//Prompt the user to enter Annual Return
		System.out.print("Enter Annual Return: ");
		double AnnualReturn = input.nextDouble();
		
		//Prompt the user to enter Years Retired
		System.out.print("Enter Years Retired: ");
		int YearsRetired = input.nextInt();
		
		//Prompt the user to enter RequiredIncome
		System.out.print("Enter Required Income: ");
		double RequiredIncome = input.nextDouble();
		
		//Prompt the user to enter Monthly SSI
		System.out.print("Enter Monthly SSI: ");
		double MonthlySSI = input.nextDouble();
		
		// Calculate What You Need Saved
		double WhatYouNeedSaved = (double)(RequiredIncome - MonthlySSI) * (double)Math.pow((1 + (double)((double)AnnualReturn / 12.0 )),(int)(12 * YearsRetired));
		
		//double monthlydeposit=1454485.55/(Math.pow((1+0.07/12), (40*12)));
		System.out.println(WhatYouNeedSaved);
		//System.out.println(monthlydeposit);
	}

}
