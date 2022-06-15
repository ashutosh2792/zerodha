package Abstract;

public abstract class Monday //class declared with abstract keyword is known as abstract class.
{
    public void demo()//complete method
	{
		System.out.println("Hello");
	}
	public abstract void test1();//incomplete method
	
		
	public static void main(String args[])
	{
		//Monday m1=new Monday();//we can not create object of abstract class bcz 
		                      // there is no constructor present in abstract class  
	      
	}
	
}
