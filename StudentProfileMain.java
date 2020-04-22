
public class StudentProfileMain {

	public static void main(String[] args) {
		StudentProfile studentA = new StudentProfile("Abhishek","Anand",3.5,"Computer Science",2021);
		StudentProfile studentB = new StudentProfile("Yoonho","Choi",4.0,"Computer Science",2022);
	    
		System.out.println(studentA.firstName + " " + studentA.lastName + " " + studentA.GPA + " " + studentA.declaredMajor + " " + studentA.expectedYearToGraduate);
		System.out.println(studentB.firstName + " " + studentB.lastName + " " + studentB.GPA + " " + studentB.declaredMajor + " " + studentB.expectedYearToGraduate);
	
		System.out.println("Updated expected year of graduation of " + studentA.firstName + " is " + studentA.incrementExpectedYearToGraduate(studentA.expectedYearToGraduate));
	}
}
