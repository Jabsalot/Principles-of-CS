/*
 * Tristan Moffett
 * CS1150 (M/W)
 * Due Date: March 6 2024
 * Assignment 7
 * This assignment will teach me how to use methods and call them within 
 * the main method. This will allow me to start condensing my code and
 * making it more structured as I will not have to repeat code.
*/

import java.util.Scanner;

public class moffettTristanAssignment7 {

	public static void main(String[] args) {
		
		// Max allowed Attempts and Password length range
		final int MAX_ALLOWED_ATTEMPTS = 4;
		final int MIN_LENGTH = 7;
		final int MAX_LENGTH = 10;
		
		// Error Codes
		final int LENGTH_ERROR = 1;
		final int LETTERS_DIGITS_ERROR = 2;
		final int TWO_DIGITS_ERROR = 3;
		final int NOT_EQUAL_LAST_TWO_PASSWORDS_ERROR = 4;
		
		// Previous Passwords
		final String PREVIOUS_PASSWORD_ONE = "cooper11";
		final String PREVIOUS_PASSWORD_TWO = "to2mac2";
		
		// Variables
		int attemptsCounter = 0;
		String password = "";
		Scanner getInput = new Scanner(System.in);
		
		boolean isTestsPassed = false;
		while(!isTestsPassed && attemptsCounter < MAX_ALLOWED_ATTEMPTS) {
			
			boolean isAttemptValid = true; /* Declared here as it must be reset after every attempt */
			
			System.out.print("Enter a password: ");
			password = getInput.next();
			
			// Validate length
			if(!lengthTest(password, MIN_LENGTH, MAX_LENGTH)) {
				isAttemptValid = false;
				printErrorMessage(LENGTH_ERROR);
			}
			
			// Validate letters and digits
			if(!onlyLettersDigitsTest(password)) {
				isAttemptValid = false;
				printErrorMessage(LETTERS_DIGITS_ERROR);
			}
			
			// Validate only 2 digits
			if(!containsTwoDigitsTest(password)) {
				isAttemptValid = false;
				printErrorMessage(TWO_DIGITS_ERROR);
			}
			
			// Validate that password entered doesn't equal last two passwords used
			if(!differentThanLastTwoPasswordsTest(PREVIOUS_PASSWORD_ONE, 
												  PREVIOUS_PASSWORD_TWO,
												  password)) {	
				isAttemptValid = false;
				printErrorMessage(NOT_EQUAL_LAST_TWO_PASSWORDS_ERROR);
			}
			
			attemptsCounter++;
			
			// If attempt is still valid set isTestsPassed to true (WILL EXIT WHILE LOOP)
			if(isAttemptValid) {
				isTestsPassed = true;
			}
			
			// If max attempts made let user know and exit application
			else if(attemptsCounter == MAX_ALLOWED_ATTEMPTS) {
				System.out.println("\n4 Attempts entered did not meet requirements");
			}
		} // WHILE LOOP
		
		// if tests passed let user know password meets all requirements
		if(isTestsPassed) {
			System.out.println("\nYour password meets all requirements");
		}
	} // MAIN METHOD
	
	/**
	 * Method returns true if length of password is within the valid length range
	 * @param password
	 * @param minLength
	 * @param maxLength
	 * @return boolean
	 */
	public static boolean lengthTest(String password, int minLength, int maxLength) {
		if(password.length() >= minLength && password.length() <= maxLength) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method returns true if password contains only letters and digits
	 * @param password
	 * @return boolean
	 */
	public static boolean onlyLettersDigitsTest(String password) {
		
		// Loops through entire string checking for invalid characters
		for(int i = 0; i < password.length(); i++) {
			
			// Checks if current characters is not a digit or letter
			if(!(password.charAt(i) >= 48 && password.charAt(i) <= 57) &&	// ASCII Digits
			   !(password.charAt(i) >= 65 && password.charAt(i) <= 90) &&	// ASCII Upper-Case Letters
			   !(password.charAt(i) >= 97 && password.charAt(i) <= 122)) {	// ASCII Lower-Case Letters
				return false;
			} // IF STATEMENT
		} // FOP LOOP
		return true;
	}
	
	/**
	 * Method returns valid if password only contains 2 digits
	 * @param password
	 * @return boolean
	 */
	public static boolean containsTwoDigitsTest(String password) {
		int digitCounter = 0;
		
		// Loops through entire string updating digitCounter if character is a digit
		for(int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= 48 && password.charAt(i) <= 57) {
				digitCounter++;
			}
		}
		
		// if digitCounter equals 2 return true otherwise false
		if(digitCounter == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Method returns true if the current password doesn't equal the last two passwords
	 * @param prevPasswordOne
	 * @param prevPasswordTwo
	 * @param password
	 * @return boolean
	 */
	public static boolean differentThanLastTwoPasswordsTest(String prevPasswordOne, 
															String prevPasswordTwo, 
															String password) {
		
		// if password doesn't equal other passwords return true
		if(!password.equals(prevPasswordOne) && !password.equals(prevPasswordTwo)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method will print the corresponding error message that is passed.
	 * Error messages in order are: 
	 * (1) Length Error,
	 * (2) Letters Digits Error, 
	 * (3) Two Digits Error,
	 * (4) Different Than Last Two Passwords Error
	 * @param errorCode
	 */
	public static void printErrorMessage(int errorCode) {
		
		// Will print corresponding error message.
		// Default case is used for debugging
		switch(errorCode) {
			case 1:
				System.out.println("Password does not meet requirement: must be between 7 and 10 characters");
				break;
			case 2:
				System.out.println("Password does not meet requirement: must contain only letters and digits");
				break;
			case 3: 
				System.out.println("Password does not meet requirement: must contain only 2 digits");
				break;
			case 4:
				System.out.println("Password does not meet requirement: must be different than previous 2 passwords");
				break;
			default:
				System.out.println("ERROR CODE PASSED IS NOT VALID");
				break;
		}
	}
} // CLASS
