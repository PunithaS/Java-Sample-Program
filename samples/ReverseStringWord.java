package assignment;

public class ReverseStringWord {

	public static void main(String[] args) {
		 
	    String revstr[] = { "This","is","a","Java","Program"};
	    
	    for (int i=0;i<revstr.length;i++ )
	    {
	    	System.out.print(revstr[i]+" ");
	    }

	   System.out.println();
	   
	   //Reverse the words in the String
	    for (int counter = 0; counter < revstr.length; counter++) {
	    	for(int revcounter=revstr[counter].length()-1;revcounter>=0;revcounter--)
	    	{
	        System.out.print(revstr[counter].charAt(revcounter));
	    	}
	    	System.out.print(" ");
	    }
	}

}
