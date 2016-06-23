package challenge.ayush;

public class CompareAndPrintString {

	public static void main(String[] args) {
		printDifOfString("BC", "BANGALORE");

	}

public static void printDifOfString( String str1, String str2 )
{
    int[] lettersOfStr1 = new int[256]; // Assume String contains only ASCII Characters
    
    for( int i = 0; i < str1.length(); i++ )
    {
        lettersOfStr1[str1.charAt(i)]++; 
    } 
        
    // Find Diff of Str1 to Str2, Show Characters of Str1 only
    for( int i = 0; i < str2.length(); i++ )
    {
        if(lettersOfStr1[str2.charAt(i)] > 0)
        	lettersOfStr1[str2.charAt(i)] = -1;
    }
    
    StringBuilder output1 = new StringBuilder();
    
    for( int i=0; i < str1.length(); i++ )
    {
        if(lettersOfStr1[str1.charAt(i)] > 0)
        {
                output1.append(str1.charAt(i));
        }
    }
    
    if(output1.length()==0)
    {
    	System.out.println("NULL");
    }
    else
    System.out.println(output1);
    
    
    StringBuilder output2 = new StringBuilder();
    
    for( int i=0; i < str2.length(); i++ )
    {
        if(lettersOfStr1[str2.charAt(i)] != -1)
        {
                output2.append(str2.charAt(i));
        }
    }
    if(output2.length()==0)
    {
    	System.out.println("NULL");
    }
    else
    System.out.println(output2);
}

}
