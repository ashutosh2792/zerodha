package upcasting;

class father
{
	public void car()
	{
		System.out.println("Car: Honda city");
	}
	
	public void money()
	{
		System.out.println("money: 1L");
	}
		
	public void home()
	{
		System.out.println("home: 2BHK");
	}	
}

class son extends father
{
	public void mobile()    //original method of son clas
	{
		System.out.println("mobile: samsung A50");
	}
		
	public void car()      //overriding
	{
		System.out.println("Car: kia seltos");
	}
	
	public void money()   //overriding
	{
		System.out.println("money: 0.75L");
	}
		
//	public void home()
//	{
//		System.out.println("home: 2BHK");
//	}	
	
}

public class UpCasting 
{
public static void main(String[] args) {
		
	father s=new son();   //upcasting
	s.car();
	s.money();
	s.home();
	
	
	
	
	//create object of sub class provide reference/type of super class
	
}
}






