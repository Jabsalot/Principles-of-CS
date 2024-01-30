import java.util.Scanner;

public class moffettTristanAssignment2 {

	final static double EXPONENT_CONSTANT = 0.16;
	
	public static void main(String[] args) {
		
		// Variables
		String nameLoc1;
		double windSpeedLoc1;
		double fahrenheitLoc1;
		double windChillLoc1F;
		double celsiusLoc1;
		double windChillLoc1C;
		
		String nameLoc2;
		double windSpeedLoc2;
		double fahrenheitLoc2;
		double windChillLoc2F;
		double celsiusLoc2;
		double windChillLoc2C;
		
		double windSpeedDiff;
		double fahrenheitDiff;
		double windChillFahrenDiff;
		double celsiusDiff;
		double windChillCelsiusDiff;
		
		// Create Scanner object that takes input from keyboard
		Scanner userInput = new Scanner(System.in);
		
		// Prompt user for first locations information
		System.out.println("Location #1 Information:");
		System.out.println("------------------------");
		System.out.printf("%s", "Enter name of first location: ");
		nameLoc1 = userInput.next();
		System.out.printf("%s", "Enter wind speed of first location: ");
		windSpeedLoc1 = userInput.nextDouble();
		System.out.printf("%s", "Enter the temp in Fahrenheit at first location: ");
		fahrenheitLoc1 = userInput.nextDouble();
		System.out.println();
		
		// Prompt user for second locations information
		System.out.println("Location #2 Information:");
		System.out.println("------------------------");
		System.out.printf("%s", "Enter name of second location: ");
		nameLoc2 = userInput.next();
		System.out.printf("%s", "Enter wind speed of second location: ");
		windSpeedLoc2 = userInput.nextDouble();
		System.out.printf("%s", "Enter the temp in Fahrenheit at second location: ");
		fahrenheitLoc2 = userInput.nextDouble();
		System.out.println();
		
		// Close Scanner Object to save on memory
		userInput.close();
		
		// Calculate first areas wind chill(F), Celsius, and wind chill(C)
		windChillLoc1F = 35.74 + (0.6215 * fahrenheitLoc1) - 
						(35.75 * Math.pow(windSpeedLoc1, EXPONENT_CONSTANT)) + 
						(0.4275 * fahrenheitLoc1 * Math.pow(windSpeedLoc1, EXPONENT_CONSTANT));
		celsiusLoc1 = (fahrenheitLoc1 - 32) * (5.0/9.0);
		windChillLoc1C = (windChillLoc1F - 32) * (5.0/9.0);
		
		// Calculate second areas wind chill(F), Celsius, and wind chill(C)
		windChillLoc2F = 35.74 + (0.6215 * fahrenheitLoc2) - 
						(35.75 * Math.pow(windSpeedLoc2, EXPONENT_CONSTANT)) + 
						(0.4275 * fahrenheitLoc2 * Math.pow(windSpeedLoc2, EXPONENT_CONSTANT));
		celsiusLoc2 = (fahrenheitLoc2 - 32) * (5.0/9.0);
		windChillLoc2C = (windChillLoc2F - 32) * (5.0/9.0);
		
		// Calculate differences between two locations
		windSpeedDiff = Math.abs(windSpeedLoc1 - windSpeedLoc2);
		fahrenheitDiff = Math.abs(fahrenheitLoc1 - fahrenheitLoc2);
		windChillFahrenDiff = Math.abs(windChillLoc1F - windChillLoc2F);
		celsiusDiff = Math.abs(celsiusLoc1 - celsiusLoc2);
		windChillCelsiusDiff = Math.abs(windChillLoc1C - windChillLoc2C);
		
		// Display Data
		System.out.println("*********************************************************************************************");
		System.out.printf("%55s\n", "Wind Chill Calculator");
		System.out.println("*********************************************************************************************\n");
		System.out.println("Location\tWind Speed\tTemperature(F)\tWind Chill(F)\tTemperature(C)\tWind Chill(C)");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", nameLoc1, 
																		  windSpeedLoc1, 
																		  fahrenheitLoc1, 
																		  windChillLoc1F, 
																		  celsiusLoc1, 
																		  windChillLoc1C);
		System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", nameLoc2, 
																		  windSpeedLoc2, 
																		  fahrenheitLoc2, 
																		  windChillLoc2F, 
																		  celsiusLoc2, 
																		  windChillLoc2C);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%s\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", "Differences", 
																	    windSpeedDiff, 
																		fahrenheitDiff, 
																		windChillFahrenDiff, 
																		celsiusDiff, 
																		windChillCelsiusDiff);

	} // main

} // moffettTristanAssignment2
