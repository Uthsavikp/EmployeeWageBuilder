public class EmployeeWageProblem {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");
				// Constants
		int IS_FULL_TIME = 1;
					// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Absent");
				
	}
}
