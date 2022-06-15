package Inheritance;

public class Daughter extends Parent1 {
	
	public void div()
	{
		c=a/b;
		System.out.println("division is "+c);
	}


	public static void main(String[] args) {
	
		Daughter obj=new Daughter();
		obj.div();
		obj.add();

	}

}
