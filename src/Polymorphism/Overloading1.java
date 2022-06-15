//method overloading
	
package Polymorphism;

public class Overloading1 {
		
		int add()//without argument
		{
			System.out.println("method overloading :");
			return 0;
		}
		int add(int a)//with argument
		{
			return a;
		}
		int add(int a,int b)
		{
			return a+b;
		
		}
		int add(int a,int b,int c)
		{
		    return a+b+c;
		}
	    
		public static void main(String args[])
		{
			Overloading1 c1=new Overloading1();
			System.out.println(c1.add());//without argument
			System.out.println(c1.add(20));//with argument
			System.out.println(c1.add(20,30));
			System.out.println(c1.add(20,30,10));
		}
	}


	