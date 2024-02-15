
public class moffettTristanAssignment5 {

	public static void main(String[] args) {
		
		final String FOUR_OF_KIND_MESSAGE = "4 of a kind!";
		final String THREE_OF_KIND_MESSAGE = "3 of a kind!";
		final String TWO_OF_KIND_MESSAGE = "2 of a kind!";
		final String ONE_OF_KIND_MESSAGE = "1 of a kind!";
		
		String rollType = "";
		
		int rollCounter = 0;
		
		int dieOne = 0;
		int dieTwo = 0;
		int dieThree = 0;
		int dieFour = 0;
		
		int fourOfKindCounter = 0;
		int threeOfKindCounter = 0;
		int twoOfKindCounter = 0;
		int oneOfKindCounter = 0;
		
		double totalProbability = 0;
		double fourOfKindProbability = 0;
		double threeOfKindProbability = 0;
		double twoOfKindProbability = 0;
		double oneOfKindProbability = 0;
		
		// Print boiler plate to console
		System.out.println("Roll\tDie#1\tDie#2\tDie#3\tDie#4\tType");
		System.out.println("----------------------------------------------------");
		
		// Start dice game
		while(!rollType.equals("4 of a kind!"))
		{
			// Roll dice
			dieOne   = (int)(1 + Math.random() * 6);
			dieTwo   = (int)(1 + Math.random() * 6);
			dieThree = (int)(1 + Math.random() * 6);
			dieFour  = (int)(1 + Math.random() * 6);
			
			// 4 of a kind
			if(dieOne == dieTwo && dieOne == dieThree && dieOne == dieFour)
			{
				rollType = FOUR_OF_KIND_MESSAGE;
				fourOfKindCounter++;
			}
			
			// 3 of a kind
			else if((dieOne == dieTwo   && dieOne == dieThree) ||
					(dieOne == dieTwo   && dieOne == dieFour)  ||
					(dieOne == dieThree && dieOne == dieFour)  ||
					(dieTwo == dieThree && dieTwo == dieFour))
			{
				rollType = THREE_OF_KIND_MESSAGE;
				threeOfKindCounter++;
			}
			
			// 2 of a kind
			else if((dieOne == dieTwo)   || (dieOne == dieThree) || (dieOne == dieFour) ||
					(dieTwo == dieThree) || (dieTwo == dieFour)  || (dieThree == dieFour))
			{
				rollType = TWO_OF_KIND_MESSAGE;
				twoOfKindCounter++;
			}
			
			// 1 of a kind
			else 
			{
				rollType = ONE_OF_KIND_MESSAGE;
				oneOfKindCounter++;
			}
			
			// Display current roll results
			System.out.println((rollCounter + 1) + "\t" + 
							   dieOne      	     + "\t" + 
							   dieTwo            + "\t" + 
							   dieThree          + "\t" +
							   dieFour           + "\t" +
							   rollType);
			
			// Update main counter
			rollCounter++;
		} // while loop
		
		// Calculate statistics
		fourOfKindProbability  = ((double)fourOfKindCounter  / rollCounter) * 100;
		threeOfKindProbability = ((double)threeOfKindCounter / rollCounter) * 100;
		twoOfKindProbability   = ((double)twoOfKindCounter   / rollCounter) * 100;
		oneOfKindProbability   = ((double)oneOfKindCounter   / rollCounter) * 100;
		 
		totalProbability = fourOfKindProbability + threeOfKindProbability +
				           twoOfKindProbability  + oneOfKindProbability;
		
		// Print statistics boiler plate
		System.out.println("\n\t\t--------------------");
		System.out.println("\t\tDICE ROLLING RESULTS");
		System.out.println("\t\t--------------------\n");
		
		// Print statistics
		System.out.println("Type\t\tOccurrences\tProbability");
		System.out.println("--------------------------------------------");
		System.out.printf("%s%d%s%.2f%s", "4 of a kind\t", fourOfKindCounter , "\t\t", fourOfKindProbability , "\n");
		System.out.printf("%s%d%s%.2f%s", "3 of a kind\t", threeOfKindCounter, "\t\t", threeOfKindProbability, "\n");
		System.out.printf("%s%d%s%.2f%s", "2 of a kind\t", twoOfKindCounter  , "\t\t", twoOfKindProbability  , "\n");
		System.out.printf("%s%d%s%.2f%s", "1 of a kind\t", oneOfKindCounter  , "\t\t", oneOfKindProbability  , "\n");
		
		// Print statistic totals
		System.out.println("--------------------------------------------");
		System.out.printf("%s%d%s%.2f%s", "Totals\t\t", rollCounter, "\t\t", totalProbability, "\n");
	} // main

} // moffettTristanAssignment5
