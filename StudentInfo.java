import java.util.Scanner;

public class StudentInfo {
      public static void main(String[] args) {
    	  double studentGPA = 3.5;
    	  String studentFirstName = "Abhishek";
    	  String studentLastName ="Anand";
    	  
    	  System.out.println(studentFirstName+" "+studentLastName+" has a GPA of "+studentGPA);
    	  System.out.println("What do you want to update it to ?");
    	  
    	  Scanner input = new Scanner(System.in);
    	  studentGPA = input.nextDouble();
    	  System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA );
      }
}
