package samples;

public class countingstringarray {

	public static void main(String[] args) {

	    // declaring and populating array
	    String quoteArray[] = { "Continuous", "effort", "not", "strength",
	            "nor", "intelligence", "is", "the", "key", "to", "unlocking",
	            "our", "potential" };

	   
	    for (int counter = 0; counter < quoteArray.length; counter++) {
	    	for(int revcounter=quoteArray[counter].length()-1;revcounter>=0;revcounter--)
	    	{
	        System.out.print(quoteArray[counter].charAt(revcounter));
	    	}
	    	System.out.println();
	    }

	    // Printing array using Enhanced for/ for each loop (Different way to
	    // print array)
	    for (String element : quoteArray) {
	        System.out.print(element + " ");
	    }// end of enhanced for

	   
	    System.out.println();

	    // printing number of words in array
	    System.out.println("Number of words in array: " + quoteArray.length);

	    // printing total number of letters in array**
	    int  total1 = 0;
	    for (int counter = 0; counter < quoteArray.length; counter++) {
	    
	  
	     total1 = total1 + quoteArray[counter].length();
	    }
	    System.out.println("Total length of array is: " + total1);
	   

	}

}
