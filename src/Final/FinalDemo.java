package Final;

class FinalDemo extends Superdemo
{
	
	 void add()//error:-we cannot override final method when is declared as final
	 {
		int c=a-b;
		System.out.println(c);
	 }
	
	public static void main(String args[])
	{
		FinalDemo obj=new FinalDemo();
		obj.add();
		obj.a=20;//cannot change the value as variable is final
		//System.out.println(a);
		
		
	}

}

