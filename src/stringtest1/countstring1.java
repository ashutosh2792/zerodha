package stringtest1;

public class countstring1 {

	public static void main(String[] args)
	{
		String s1="ashutosh";
		int count=0;
	
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' '|| s1.charAt(i)==' ')		
			{
				count++;
				
			}	
		}
		 System.out.println("Total number of characters in a string: " + count);  

	}

}
