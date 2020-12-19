public class EmployeeWageProblem { 	

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		System.out.println("Welcome To Employee Wage Computation");
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth &&
				totalWorkingDays < numOfWorkingDays){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company:"  + company +" is: " +totalEmpWage);
		//return totalEmpWage;
		return totalEmpWage;
	}
	public static void main(String[] args) {
		computeEmpWage("DMart", 200, 2, 10);
		computeEmpWage("BigBazzar", 150, 4, 20);
	}
	
}
