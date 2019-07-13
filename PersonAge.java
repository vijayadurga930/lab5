package Lab5;

import java.util.Scanner;

class InvalidAgeException extends Exception {


InvalidAgeException(){
       System.out.println("the age should be greater than 15");
   
}


	public static void main(String[] args) {
		System.out.println(" enter your age:");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt(); 
		try
		{
			if (age<15) throw  new InvalidAgeException();
	        
            else 
                System.out.println("the age is:" + age);
        
            }
		catch (Exception e) {
			
							}
    scanner.close();
}

		{
		
	}

}

	