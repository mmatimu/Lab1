// LAB#1 BY Michael Matimu and Alexander Slotkin

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter Years To Work
		System.out.print("Enter Years To Work: ");
		int YearsToWork = input.nextInt();
		
		/* Prompt the user to enter Annual Return
		 * to calculate Future Value
		 */
		System.out.print("Enter Annual Return to calculate future value: ");
		double AnnualReturn = input.nextDouble();
		
		/* Prompt the user to enter Annual Return 
		 * to calculate Present Value
		 */
		System.out.print("Enter Annual Return to calculate present value: ");
		double Annualreturn = input.nextDouble();
		
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
		double WhatYouNeedSaved = (double)(RequiredIncome - MonthlySSI) * ((1-(1/(double)Math.pow((1 + (double)((double)AnnualReturn / 12.0)),(int)(12 * YearsRetired)))) / ((double)(AnnualReturn / 12.0))); 
		
		//Calculate how much money you need to Save Each Month
		double SaveEachMonth = (double)(WhatYouNeedSaved) / ((((double)Math.pow((1 + (Annualreturn / 12.0)), (int)(YearsToWork * 12))) - 1) / ((double)(Annualreturn / 12.0)));
		
		System.out.print("What you need saved: ");
		System.out.println(WhatYouNeedSaved);
		System.out.print("What you need to save each month: ");
		System.out.println(SaveEachMonth);
		
	}

}
