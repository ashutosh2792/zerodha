package practice;

public class fibbonacci {

	public static void main(String[] args) {
		
		int num1=0,num2=1,sum=0,num=5,i=1;
		
		while(i<=num)
		{
		  sum=num1+num2;
		  System.out.println(num1+"  "+num2+"  "+sum);
		  num1=num2;
		  num2=sum;
		  i++;
		}	

	}

}
