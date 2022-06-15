//Constructor
package Basic_java;

public class Constructor {
	
		int a;
		float b;
		String c;
		
		/*Constructor()//default constructor
		{
			//System.out.println("default constructor");
		}*/
		
		Constructor()//parametrized without argument
		{
			a=10;
			b=15.20f;
	    	c="sachin";
		}
		
		Constructor(int x)//parametrized with argument
		{
		    a=x;
		    
		}
		
		Constructor(int x,float y)//parametrized with argument
		{
		    a=x;
		    b=y;
		}
		
		
		
		
		public static void main(String args[])
		{
			Constructor t1=new Constructor();
			Constructor t2=new Constructor();
			Constructor t3=new Constructor(20);
			
			Constructor t4=new Constructor(50,18.8f);
			
		    System.out.println(t1.a);
			System.out.println(t1.b);
			System.out.println(t1.c);

			System.out.println(t2.a);
			System.out.println(t2.b);
			System.out.println(t2.c);
			
			System.out.println(t3.a);
			
			System.out.println(t4.a);
			System.out.println(t4.b);
			
			
			
			
			
		}
		

	}



