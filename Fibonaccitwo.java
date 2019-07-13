package Lab5;

import java.util.Scanner;

public class Fibonaccitwo {
	private int check(int num) {
		int i=0,sum=0;
		for(i=0;i<=num;i++)
		{
		   sum=sum+i;
		} 
		return sum;
	}


	public static void main(String[] args)
	{
		System.out.println(" enter a number:");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		Fibonaccitwo fibonacci=new Fibonaccitwo();
		int output= fibonacci.check(num);
		System.out.println("sum is"+output);	
		scanner.close();
		

	}
	
}
