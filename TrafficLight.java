package Lab5;

import java.util.Scanner;

public class TrafficLight 
{
	public String Check(int option) {
	
	{
		switch(option)
		{
		case 1:
		{
			System.out.println("STOP");
		}
		break;
		case 2:
		{
			System.out.println("GO");
		}
		break;
		case 3:
		{
			System.out.println("ready to go");
		}
		break;
		}
	}
	return null;
	}


	public static void main(String[] args)
	{   
		System.out.println(" enter 1.red\n 2.green\n 3.yellow");
		Scanner scanner=new Scanner(System.in);
		int option= scanner.nextInt();
		TrafficLight traffic=new TrafficLight();
		String res= traffic.Check(option);
		scanner.close();
	}
}
