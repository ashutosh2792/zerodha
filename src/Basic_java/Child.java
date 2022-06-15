//access specifier
package Basic_java;

//only public and protected member access outside the package and use import keyword
import Inheritance.Parent1;//import keyword is use to access the property of class outside the package

public class Child extends Parent1  //extends keyword is use to inherit the property of one class to another class.
{	
	public void add()
	{
		c=a-b;
		System.out.println("substraction is "+c);
	}


	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.add();
		
		
	}

}



