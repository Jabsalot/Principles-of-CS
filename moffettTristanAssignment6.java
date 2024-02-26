/*
 * Tristan Moffett
 * CS1150 (M/W)
 * Due Date: February 29 2024
 * Assignment 6
 * This assignment will teach me how to properly nest while and for loops
 * to simulate a vending machine. This will allow me to properly store the
 * needed data when the vending machine exits customer mode.
*/

import java.util.Scanner;

public class moffettTristanAssignment6 {
	
	public static void main(String[] args)
	{
		final double POTATO_CHIP_PRICE = 1.75;
		final double PRETZEL_PRICE     = 1.50;
		final double KIND_BAR_PRICE    = 0.80;
		
		double totalEarned = 0;
		int totalSnackCounter = 0;
		int potatoChipCounter = 0;
		int pretzelCounter = 0;
		int kindBarCounter = 0;
		
		int customerRequest = 0;
		String snackRequest = "";
		Scanner getInput = new Scanner(System.in);

		// Get customer input
		System.out.print("Enter snack amount (max 3) otherwise enter 999 to exit: ");
		customerRequest = getInput.nextInt();
		
		// Validate request input
		while((customerRequest < 1 || customerRequest > 3) && customerRequest != 999) {
			System.out.print("Enter snack amount (max 3) otherwise enter 999 to exit: ");
			customerRequest = getInput.nextInt();
		}
		System.out.println();
		
		// Customer Mode
		while(customerRequest != 999) {
			
			// Display snacks
			System.out.println("\t\tSnack Machine");
			System.out.println("---------------------------------------------");
			System.out.println("Potato Chips\tPotato Chips\tPotato Chips");
			System.out.println("A1 $1.75\tA2 $1.75\tA3 $1.75");
			System.out.println("---------------------------------------------");
			System.out.println("Pretzels\tPretzels\tPretzels");
			System.out.println("B1 $1.50\tB2 $1.50\tB3 $1.50");
			System.out.println("---------------------------------------------");
			System.out.println("Kind Bar\tKind Bar\tKind Bar");
			System.out.println("C1 $0.80\tC2 $0.80\tC3 $0.80");
			System.out.println();
			
			// Take customers order
			for(int i = 0; i < customerRequest; i++) {
				
				// Get snack input
				System.out.print("Which snack would you like: ");
				snackRequest = getInput.next();
				
				// Validate snack input
				while(!(snackRequest.equals("A1") || snackRequest.equals("A2") || snackRequest.equals("A3") ||
					    snackRequest.equals("B1") || snackRequest.equals("B2") || snackRequest.equals("B3") || 
					    snackRequest.equals("C1") || snackRequest.equals("C2") || snackRequest.equals("C3"))) {
					System.out.print("Which snack would you like: ");
					snackRequest = getInput.next();
				}
				
				// Apply earnings and update counts
				switch (snackRequest) {
					case "A1":
					case "A2":
					case "A3":
						totalEarned += POTATO_CHIP_PRICE;
						potatoChipCounter++;
						totalSnackCounter++;
						break;
						
					case "B1":
					case "B2":
					case "B3":
						totalEarned += PRETZEL_PRICE;
						pretzelCounter++;
						totalSnackCounter++;
						break;
						
					case "C1":
					case "C2":
					case "C3":
						totalEarned += KIND_BAR_PRICE;
						kindBarCounter++;
						totalSnackCounter++;
						break;
				} // switch
			} // for 
			
			// Get customer input
			System.out.print("\nEnter snack amount (max 3) otherwise enter 999 to exit: ");
			customerRequest = getInput.nextInt();
			
			// Validate request input
			while((customerRequest < 1 || customerRequest > 3) && customerRequest != 999) {
				System.out.print("Enter snack amount (max 3) otherwise enter 999 to exit: ");
				customerRequest = getInput.nextInt();
			}
			System.out.println();
		} // while loop		
		
		// Close scanner object
		getInput.close();
		
		// Display output
		System.out.println("Total Sale: $" + totalEarned + "\n" + 
						   "Total Number of Snacks Sold: " + totalSnackCounter + "\n" +
						   "Potato Chips Sold: " + potatoChipCounter + "\n" + 
						   "Pretzels Sold: " + pretzelCounter + "\n" + 
						   "Kind Bars Sold: " + kindBarCounter + "\n");
	} // main
}
