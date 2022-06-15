//Static and non static variable
package Basic_java;

public class Variable {

	    int a=5;//non static or instance variables
	    int b=10;
		static int x=15;//static or class variables
		static int y=20;
		
		public void m1()// static and non static variables are use in non static method
		{
			int c=a+b;
			System.out.println(c);
		}
		
		public static void m2()// only static variables are use in static method
		{
			int z=x+y;
			System.out.println(z);
		}
		
		public static void main(String args[])
		{
			Variable v1=new Variable();
			//Variable v2=new Variable();
			
			v1.m1(); //there is need to create object to call non-static method.
			   m2();//there is no need to create object to call static method.
			
			
		}

	}

