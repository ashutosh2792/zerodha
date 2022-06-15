package Polymorphism;

class Bank {
	
	void interest()
	{
		System.out.println("0 %");
	}	
	
}

 class SBI extends Bank
{
	 void interest()
		{
			System.out.println("SBI 4 %");
		}
}
 
 class ICICI extends Bank
{
	 void interest()
		{
			System.out.println("ICICI 8 %");
		}
}
 

 
  public class Overriding1
 {
	 public static void main(String args[])
	 {
		 SBI obj=new SBI();
		 obj.interest();
		 
		 ICICI obj1=new ICICI();
		 obj1.interest();
		 
		 
		 

		 
	 }
 }
		

