package stringtest1;

public class Maxoccurance {

	//Java Program to find the maximum and minimum occurring character in a string


	   public static void main(String[] args) 
	   {  
	        String str = "green";  
	        int[] freq = new int[str.length()];  
	        char minChar = str.charAt(0), maxChar = str.charAt(0);  
	        int i, j, min, max;          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	        //Count each word in given string and store in array freq  
	        for(i = 0; i < string.length; i++) 
	        {  
	            freq[i] = 1;  
	            for(j = i+1; j < string.length; j++) 
	            {  
	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
	                {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	        //Determine minimum and maximum occurring characters  
	        min = max = freq[0];  
	        for(i = 0; i <freq.length; i++) 
	        {  
	            if(min > freq[i] && freq[i] != '0') 
	            {  
	                min = freq[i];  
	                minChar = string[i];  
	            }  
	            
	            if(max < freq[i]) 
	            {  
	                max = freq[i];  
	                maxChar = string[i];  
	            }  
	        }  
	        //Print the minimum and maximum occurring characters  
	        System.out.println("Minimum occurring character: " + minChar);  
	        System.out.println("Maximum occurring character: " + maxChar);  
	    }  
	}


