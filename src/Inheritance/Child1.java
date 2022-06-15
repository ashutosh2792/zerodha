package Inheritance;

public class Child1 extends Parent1  //properties are inherited by child class
{	
	public void sub()
	{
		c=a-b;
		System.out.println("substraction is "+c);
	}


	public static void main(String[] args) 
	{
		Child1 obj=new Child1();
		obj.sub();
		obj.add();
		
		
	}

}
