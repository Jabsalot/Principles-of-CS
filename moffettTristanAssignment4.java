import java.util.Scanner;

public class moffettTristanAssignment4 {

	final static char COLORADOCHAR = 'C';
	final static char WYOMINGCHAR = 'W';
	final static char UTAHCHAR = 'U';
	final static int PLATENUMBERRANGE = 10;
	final static int PLATECHARACTERANGE = 26;
	final static int ASCIINUMSTART = 48;
	final static int ASCIICHARACTERSTART = 65;
	
	public static void main(String[] args) {
		
		// Variables
		String stateName = "";
		String licensePlate = "";
		String userInput = "";
		char stateChar = '\0';
		char licenseType = '\0';
		
		// Initialize Scanner
		Scanner getInput = new Scanner(System.in);
		
		// Display available States and License Types
		System.out.println("Available States\n"
						 + "----------------");
		System.out.println("C: Colorado\nW: Wyoming\nU: Utah\n");
		System.out.println("Available License Types\n"
						 + "-----------------------");
		System.out.println("1: Regular\n2: Adopt a Pet\n3: Fire Fighter\n");
		
		// Prompt user for input and store input
		System.out.print("Enter one character each for state and license type: ");
		userInput = getInput.nextLine();
		System.out.println();
		
		// Delete scanner object
		getInput.close();
		
		// Modify string and store elements from string
		userInput.replaceAll("\\s", "");
		userInput = userInput.toUpperCase();
		stateChar = userInput.charAt(0);
		licenseType = userInput.charAt(1);
		
		// Valid Input
		if(userInput.length() == 2 &&
		  (stateChar == COLORADOCHAR || stateChar == WYOMINGCHAR || stateChar == UTAHCHAR) &&
		  (licenseType == '1' || licenseType == '2' || licenseType == '3')) 
		{
			// Generate Colorado License Plate
			if(stateChar == COLORADOCHAR) 
			{
				stateName = "Colorado";
				int validValueCounter = 0;
				char currChar = '\0';
				char prevChar = '\0';
				
				// Generate plate numbers
				while(validValueCounter < 3)
				{
					currChar = (char)(ASCIINUMSTART + (Math.random() * PLATENUMBERRANGE));
					if(validValueCounter == 0 || currChar != prevChar)
					{
						licensePlate += currChar;
						prevChar = currChar;
						validValueCounter++;
					}
				} // while loop
				
				// Reset counter and add dash to string
				validValueCounter = 0;
				licensePlate += '-';
				
				// Generate plate characters
				while(validValueCounter != 3)
				{
					currChar = (char)(ASCIICHARACTERSTART + (Math.random() * PLATECHARACTERANGE));
					if(validValueCounter == 0 || currChar != prevChar)
					{
						licensePlate += currChar;
						prevChar = currChar;
						validValueCounter++;
					}
				} // while loop
			} // if statement
			// Generate Wyoming License Plate
			else if(stateChar == WYOMINGCHAR) 
			{
				stateName = "Wyoming";
				int validValueCounter = 0;
				char currChar = '\0';
				char prevChar = '\0';
				
				// Get start for license plate
				currChar = (char)(ASCIINUMSTART + (Math.random() * PLATENUMBERRANGE));
				licensePlate = licensePlate + currChar + ' ';
				
				// Generate plate characters
				while(validValueCounter != 5)
				{
					currChar = (char)(ASCIICHARACTERSTART + (Math.random() * PLATECHARACTERANGE));
					if(validValueCounter == 0 || currChar != prevChar)
					{
						licensePlate += currChar;
						prevChar = currChar;
						validValueCounter++;
					}
				} // while loop
			} // else if statement
			// Generate Utah License Plate
			else 
			{
				stateName = "Utah";
				int validValueCounter = 0;
				char currChar = '\0';
				char prevChar = '\0';
				
				// Generate plate characters
				while(validValueCounter != 3) 
				{
					currChar = (char)(ASCIICHARACTERSTART + (Math.random() * PLATECHARACTERANGE));
					if(validValueCounter == 0 || currChar != prevChar)
					{
						licensePlate += currChar;
						prevChar = currChar;
						validValueCounter++;
					}
				} // while loop
			
				licensePlate += ' ';
				
				// Add a random number and character
				currChar = (char)(ASCIINUMSTART + (Math.random() * PLATENUMBERRANGE));
				licensePlate += currChar;
				currChar = (char)(ASCIICHARACTERSTART + (Math.random() * PLATECHARACTERANGE));
				licensePlate += currChar;	
			} // else statement
			
			// Display license plate with proper license type
			if(licenseType == '1')
			{
				System.out.println(stateName + ": " + licensePlate);
			}
			else if(licenseType == '2')
			{
				System.out.println(stateName + ": " + licensePlate + " --- Adopt a Shelter Pet");
			}
			else
			{
				System.out.println(stateName + ": " + licensePlate + " --- Fire Fighter");
			}
		} // if statement
		// Invalid Input
		else 
		{		
			// Display proper error message
			if(userInput.length() != 2)
			{
				System.out.println("To many characters entered");
			}
			else if(licenseType != '1' && licenseType != '2' && licenseType != '3')
			{
				System.out.println("Invalid input for license type");
			}
			else
			{
				System.out.println("Invalid input for state");
			}
		} // else statement
	} // main

} // moffettTristanAssignment4
