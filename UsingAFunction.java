import java.util.Scanner;

public class UsingAFunction {
	
	  public static void announceDeveloperTeaTime() {
		  System.out.println("Waiting to announce Developer Tea Time...");
		  System.out.println("Enter a random word.");
		  Scanner input = new Scanner(System.in);
		  input.next();
		  System.out.println("Take a Break! It's Developer Tea Time");
	  }
	
      public static void main(String[] args) {
    	  System.out.println("Welcome to your new job.");
    	  
    	  announceDeveloperTeaTime();
    	  
    	  System.out.println("Write code.");
    	  System.out.println("Review code.");
    	  
    	  announceDeveloperTeaTime();
    	  
    	  System.out.println("Get promoted.");
      }
}
