/*
 * Tristan Moffett
 * CS1150 (M/W)
 * Due Date: January 31, 2024
 * Assignment 2
 * This assignment will teach me how to use conditionals and logical 
 * operators to correctly set up a logical flow for a user to sign
 * up for a gym membership.
*/

import java.util.Scanner;

public class moffettTristanAssignment3 {

	// Initialize CONSTANT variables
	final static double platinumCost = 29.99;
	final static double goldCost = 19.99;
	final static double basicCost = 9.99;
	final static double childCareCost = 5.00;
	final static double personalTrainerCost = 20.00;
	final static double enrollmentFee = 20.00;

	public static void main(String[] args) {
		
		// Variables
		int membershipChoice = 0, addOnChoice = 0;
		double membershipCost = 0, addOnCost = 0;
		String membershipName = "", addOnName = "";
		
		// Create scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Display Membership Options
		System.out.println("Options\tMembership\tMonthly Cost");
		System.out.println("------------------------------------");
		System.out.println("1\tPlatinum\t" + "$" + platinumCost);
		System.out.println("2\tGold\t\t" + "$" + goldCost);
		System.out.println("3\tBasic\t\t" + "$" + basicCost + '\n');

		// Prompt user for input
		System.out.printf("%s", "Select a membership option: " );
		membershipChoice = userInput.nextInt();	
		System.out.println();
		
		// Check if user input is valid
		if((membershipChoice == 1) || 
		   (membershipChoice == 2) || 
		   (membershipChoice == 3)) 
		{
			// Calculate membership cost
			if(membershipChoice == 1) {
				membershipCost += platinumCost;
				membershipName = "Platinum Membership";
			} // if
			
			else if(membershipChoice == 2) {
				membershipCost += goldCost;
				membershipName = "Gold Membership";
			} // else if 
			
			else if(membershipChoice == 3) {
				membershipCost += basicCost;
				membershipName = "Basic Membership";
			} // else if
			
			else {
				System.out.println("ERROR: Something went wrong in membership validation");
			} // else
			
			// Display AddOn Options
			System.out.println("Options\t\tAdd-On\t\t\tPrice");
			System.out.println("---------------------------------------------");
			System.out.printf("%s%n", "1\t\tNo add on\t\t" + "$0.00");
			System.out.printf("%s%.2f%n", "2\t\tChildcare\t\t$", childCareCost, "\n");
			System.out.printf("%s%.2f%n%n", "3\t\tPersonal Training\t$", personalTrainerCost, "\n\n");

			// Prompt user for input
			System.out.printf("%s", "Select an add-on option: ");
			addOnChoice = userInput.nextInt();
			System.out.println();
			
			// Free Scanner Object from memory
			userInput.close();
			
			// Check if user input is valid
			if((addOnChoice == 1) || 
			   (addOnChoice == 2) ||
			   (addOnChoice == 3))
			{
				// Calculate to add-on cost
				if(addOnChoice == 1) {
					addOnCost += 0.00;
					addOnName = "No Add-On";
				}
		
				else if(addOnChoice == 2) {
					addOnCost += childCareCost;
					addOnName = "Childcare";
				} // if
				
				else if(addOnChoice == 3) {
					addOnCost += personalTrainerCost;
					addOnName = "Personal Training";
				} // else if
				
				else {
					System.out.println("ERROR: Something went wrong in add-on validation");
				} // else
				
				// Display Membership Monthly Costs
				System.out.println("------------------------------\n"
								 + "Monthly Costs\n"
								 + "------------------------------");
				System.out.printf("%-24s%s%.2f%n%n", membershipName, "$", membershipCost, "\n\n");
				
				// Display One Time Costs
				System.out.println("------------------------------\n"
						 		 + "One Time Costs\n"
						 		 + "------------------------------");
				System.out.printf("%-24s%s%.2f%n", addOnName, "$", addOnCost, "\n\n");
				System.out.printf("%-24s%s%.2f%n%n", "Enrollment Fee", "$", enrollmentFee, "\n\n");
				
				// Display Total Due Today
				System.out.println("------------------------------\n"
						 		 + "Due Today\n"
						 		 + "------------------------------");
				System.out.printf("%-24s%s%.2f%n", "Total Cost", "$", (membershipCost + addOnCost + enrollmentFee), "\n");
				
			} // if
			
			else
			{
				System.out.println(addOnChoice + " is not a valid option. Run program again!");
			} // else
			
			
		} // if (input valid)
		else
		{
			System.out.println(membershipChoice + " is not a valid option. Run program again!");
		} // else (input not valid)
		
		// Free Scanner Object from memory
		userInput.close();

	} // main

} // moffettTristanAssignment3
