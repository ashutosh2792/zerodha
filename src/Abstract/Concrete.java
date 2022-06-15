package Abstract;

public class Concrete extends Monday// concrete class as it implements 
{                                   //incompete method of monday class

	public void test1() //Was a abstract method of Monday class
	{
	   System.out.println("method is completed");
		
	}
	
	
	public static void main(String[] args)
	{
	   Concrete obj=new Concrete();
	   obj.test1();
	   obj.demo();
	  
	}

	

}
