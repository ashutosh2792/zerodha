package Inheritance;

public class Child2 extends Child1{
	
	public void mul()
	{
		c=a*b;
		System.out.println("multiplication is "+c);
	}


	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.mul();
		obj.add();
		obj.sub();

	}

}
