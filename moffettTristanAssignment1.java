/*
 * Tristan Moffett
 * CS1150 (M/W)
 * Due Date: January 24, 2024
 * Assignment 1
 * This program will show that I can use the println statement to print
 * multiple strings to the console in a clean format. This program will 
 * also give me some practice in arithmetic for java by doing conversions 
 * from the US dollar to pesos, pounds, and euros
*/

public class moffettTristanAssignment1 
{
	public static void main(String[] args) 
	{
		// Part 1: Displaying Output
		
		// Displays the first paragraph
		System.out.println("     My name is Tristan Moffett. I am a current student at the University of Colorado, Colorado Springs.\n" +
						   "I am currently working towards my B.S. in Computer Science and plan to graduate within three semesters.\n" +
						   "I became interested in computers and programming at a young age but did not start learning until my senior\n" +
						   "year of high school. This mainly came down to being a military brat and all schools around not having a CS\n" +
						   "program. To my luck though I was able to find some books on C++ and began my journey.\n");
		
		// Displays the second paragraph
		System.out.println("     A little about me. My favorite hobbies are writing music, reading, learning, programming, and playing games!\n" +
						   "My favorite books are from the author R.A Salvatore who is best known for the book series The Legend of Drizzt.\n" +
						   "I have a passion for learning new things even though at times it can be stressful along with a passion for\n" +
						   "getting better at anything I get my hands on whether that be a new game or programming language. Places I would\n" +
						   "like to travel to include Japan, Italy, France, Ireland, and Scotland.\n");
		
		// Part 2: Working with Expressions		
		
		// Displays a chart with the dollar amount equivalent in Pesos, Pounds, and Euros
		System.out.println("Dollars\tPesos\tPounds\tEuro");
		System.out.println("----------------------------");
		System.out.println("$1\t" + (1 * 17.8) + "\t" + (1 * 0.79) + "\t" + (1 * 0.91));
		System.out.println("$10\t" + (10 * 17.8) + "\t" + (10 * 0.79) + "\t" + (10 * 0.91));
		System.out.println("$20\t" + (20 * 17.8) + "\t" + (20 * 0.79) + "\t" + (20 * 0.91));
		System.out.println("$100\t" + (100 * 17.8) + "\t" + (100 * 0.79) + "\t" + (100 * 0.91));
	}
}
