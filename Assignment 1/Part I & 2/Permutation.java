import java.util.*;

public class Permutation 
{

	public static boolean isStringPermutation(String s1, String s2)
	{
		//check is strings are equal
		if(s1.length()==s2.length())
		{
			//convert string to character array
			char [] name1 = s1.toCharArray();
			char [] name2 = s2.toCharArray();
			
			//sort new character arrays from smallest to greatest
			Arrays.sort(name1);
			Arrays.sort(name2);
			
			//compare if it's the same
			boolean checker = Arrays.equals(name1,name2);
			System.out.println("Is " + s2 + " a permutation of " + s1 + "?");
				if (checker)
					
					{
					System.out.println("True");
					return true;
					}
				
				
				else
					{
					System.out.println("False");
					return false;
					}
				
		}
		
		//string lengths are not the same
		else
		{
			System.out.println("Sorry, Strings are not equal");
			return false;
		}
		
	}
	

}
