package Lab5;

import java.util.Scanner;

public class employee {
	
	
	
	 static class EmployeException extends Exception{
		 
		 EmployeException(){
			 
			 System.out.println(" salary should not be less than 3000");
		 }
		 
		 
		 
		 
		 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" enter the salary of an employee:");
		double sal=scanner.nextInt();
	
			try {
				if (sal<3000) throw new EmployeException ();
				
				else
					
					System.out.println(" salary is: "+sal);
					
					} 
			catch (Exception e){
				
			}
	}
         
	 }
}
	


	 
 



