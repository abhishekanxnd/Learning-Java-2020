public class StudentProfile {
	
	String firstName;
	String lastName;
	double GPA;
	String declaredMajor;
	int expectedYearToGraduate;
	
	public StudentProfile(String firstName, String lastName, double GPA, String declaredMajor, int expectedYearToGraduate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.GPA = GPA;
		this.declaredMajor = declaredMajor;
		this.expectedYearToGraduate = expectedYearToGraduate;

	}
	
	public int incrementExpectedYearToGraduate(int expectedYearToGraduate) {
		int updatedYear = ++expectedYearToGraduate;  
		return updatedYear;
	} 
	
	/*  OR YOU CAN USE A VOID METHOD SUCH AS
 	  public void incrementExpectedYearToGraduate() {
		this.expectedYearToGraduate = ++this.expectedYearToGraduate;
	}
	*/
 
}
