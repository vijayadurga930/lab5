package Lab5;

import java.util.Scanner;

class PrimeNumbers
{
	 public static void main (String[] args)
	   {	Scanner scanner=new Scanner(System.in);
	        System.out.println(" enter a number:");
	        int k= scanner.nextInt();
	        PrimeNumbers prime= new PrimeNumbers();
	        int primeNumbers=prime.check(k);
	   }
	    	private int check(int k) {
	    		int i =0;
	 	       int num =0;
	 	       //Empty String
	 	       String primeNumbers = "";

	 	       for (i = 1; i <= k; i++)         
	 	       { 		  	  
	 	          int counter=0; 	  
	 	          for(num =i; num>=1; num--)
	 		  {
	 	             if(i%num==0)
	 		     {
	 	 		counter = counter + 1;
	 		     }
	 		  }
	 		  if (counter ==2)
	 		  {
	 		     //Appended the Prime number to the String
	 		     primeNumbers = primeNumbers + i + " ";
	 		  }	
	 	       }	
	 	       System.out.println("Prime numbers  are :");
	 	       System.out.println(primeNumbers);
			return num;

	}
	       
	}
	