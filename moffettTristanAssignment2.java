import java.util.Scanner;

public class moffettTristanAssignment2 {

	final static double EXPONENT_CONSTANT = 0.16;
	
	public static void main(String[] args) {
		
		// Variables
		String nameLoc1;
		double windSpeedLoc1;
		double fahrenheitLoc1;
		double celsiusLoc1;
		double windChillFahrenheitLoc1;
		double windChillCelsiusLoc1;
		
		String nameLoc2;
		double windSpeedLoc2;
		double fahrenheitLoc2;
		double celsiusLoc2;
		double windChillFahrenheitLoc2;
		double windChillCelsiusLoc2;
		
		double windSpeedDiff;
		double fahrenheitDiff;
		double celsiusDiff;
		double windChillFahrenheitDiff;
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
		System.out.printf("%s", "Enter the temp in Fahrenheit of first location: ");
		fahrenheitLoc1 = userInput.nextDouble();
		System.out.println();
		
		// Prompt user for second locations information
		System.out.println("Location #2 Information:");
		System.out.println("------------------------");
		System.out.printf("%s", "Enter name of second location: ");
		nameLoc2 = userInput.next();
		System.out.printf("%s", "Enter wind speed of second location: ");
		windSpeedLoc2 = userInput.nextDouble();
		System.out.printf("%s", "Enter the temp in Fahrenheit of second location: ");
		fahrenheitLoc2 = userInput.nextDouble();
		System.out.println();
		
		// Close Scanner Object to save on memory
		userInput.close();
		
		// Calculate first areas wind chill(F), wind chill(C), and Celsius
		windChillFahrenheitLoc1 = 35.74 + (0.6215 * fahrenheitLoc1) - 
								 (35.75 * Math.pow(windSpeedLoc1, EXPONENT_CONSTANT)) + 
								 (0.4275 * fahrenheitLoc1 * Math.pow(windSpeedLoc1, EXPONENT_CONSTANT));
		windChillCelsiusLoc1 = (windChillFahrenheitLoc1 - 32) * (5.0/9.0);
		celsiusLoc1 = (fahrenheitLoc1 - 32) * (5.0/9.0);
		
		// Calculate second areas wind chill(F), wind chill(C), and Celsius
		windChillFahrenheitLoc2 = 35.74 + (0.6215 * fahrenheitLoc2) - 
							      (35.75 * Math.pow(windSpeedLoc2, EXPONENT_CONSTANT)) + 
							      (0.4275 * fahrenheitLoc2 * Math.pow(windSpeedLoc2, EXPONENT_CONSTANT));
		windChillCelsiusLoc2 = (windChillFahrenheitLoc2 - 32) * (5.0/9.0);
		celsiusLoc2 = (fahrenheitLoc2 - 32) * (5.0/9.0);
		
		// Calculate differences in data between the two locations
		windSpeedDiff = Math.abs(windSpeedLoc1 - windSpeedLoc2);
		fahrenheitDiff = Math.abs(fahrenheitLoc1 - fahrenheitLoc2);
		celsiusDiff = Math.abs(celsiusLoc1 - celsiusLoc2);
		windChillFahrenheitDiff = Math.abs(windChillFahrenheitLoc1 - windChillFahrenheitLoc2);
		windChillCelsiusDiff = Math.abs(windChillCelsiusLoc1 - windChillCelsiusLoc2);
		
		// Display chart of data
		System.out.println("*****************************************************************************************************");
		System.out.printf("%62s\n", "Wind Chill Calculator");
		System.out.println("*****************************************************************************************************\n");
		System.out.println("Location\t\tWind Speed\tTemperature(F)\tWind Chill(F)\tTemperature(C)\tWind Chill(C)");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		// Display data related to location one
		System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", nameLoc1, 
																		  windSpeedLoc1, 
																		  fahrenheitLoc1, 
																		  windChillFahrenheitLoc1, 
																		  celsiusLoc1, 
																		  windChillCelsiusLoc1);
		
		// Display data related to location two
		System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", nameLoc2, 
																		  windSpeedLoc2, 
																		  fahrenheitLoc2, 
																		  windChillFahrenheitLoc2, 
																		  celsiusLoc2, 
																		  windChillCelsiusLoc2);
		
		// Display differences in data between both locations
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", "Differences", 
																	      windSpeedDiff, 
																	      fahrenheitDiff, 
																	      windChillFahrenheitDiff, 
																	      celsiusDiff, 
																	      windChillCelsiusDiff);

	} // main

} // moffettTristanAssignment2
