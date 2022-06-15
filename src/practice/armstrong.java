package practice;

public class armstrong {

	public static void main(String[] args) {
	  int num=153,temp,r = 0;
	  int sum=0;
	  temp=num;
	  
	  while(num!=0)
	  {
		  r=num%10;//3 5 1
		  sum=sum+(r*r*r); //27+125+1
		  
		  num=num/10;//15 1 0
		  
	  }
	  if(sum==temp)
	  {
		  System.out.println("number is armstrong");
	  }	 
	  else
	  {
		  System.out.println("number is not armstrong");
	  }

	}

}
