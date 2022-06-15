package practice;

public class Palindrome {
	
	

		public static void main(String[] args) {
		  int num=121,temp,r = 0;
		  int sum=0;
		  temp=num;
		  
		  while(num!=0)
		  {
			  r=num%10;//1 2 1
			  sum=sum*10+r; //1 12 121
			  
			  num=num/10;//12 1 0
			  
		  }
		  if(sum==temp)
		  {
			  System.out.println("number is palindrome");
		  }	 
		  else
		  {
			  System.out.println("number is not palindrome");
		  }

		}


}
