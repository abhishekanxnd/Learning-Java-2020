import java.util.Scanner;
public class SalaryCalculator {
    
	public static double calculateEmployeeSalary(double noOfHours, double hourlyWage, double vacationDays) {
		if(noOfHours < 0) {
			return -1;
		}
		if(hourlyWage < 0) {
			return -1;
		}
		double unpaidTime = vacationDays * 8 * hourlyWage;
		double grossYearlySalary = (noOfHours * hourlyWage * 52) - unpaidTime;
		return grossYearlySalary;
	}
	
	public static void main(String[] args) {
		Scanner abhi = new Scanner(System.in);
		System.out.println("Please enter hours worked per week, hourly wage and number of vacation days.");
		double noOfHours = abhi.nextDouble(); 
		double hourlyWage = abhi.nextDouble();
		double vacationDays = abhi.nextDouble();
		double grossYearlySalary = calculateEmployeeSalary(noOfHours,hourlyWage,vacationDays);
		System.out.println("Your gross yearly salary is " + grossYearlySalary);
		
		

	}
	
	

}
