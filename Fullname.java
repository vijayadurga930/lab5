package Lab5;

import java.util.Scanner;

public class Fullname {
	
}
	class InvalidNameException extends Exception{
	    InvalidNameException(){
	        System.out.println("name should not be blank");
	    }

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("enter your first name:");
	        String firstname=scanner.nextLine();
	System.out.println("enter your last name:");
	String lastname= scanner.next();
	try {
		  if( lastname.length()==0 || firstname.length()==0) {
		        throw new InvalidNameException(); }
		    else {System.out.println(firstname+lastname);}

		 

		} catch (InvalidNameException e) {

		 

		}scanner.close();

		 
	

	}

}
