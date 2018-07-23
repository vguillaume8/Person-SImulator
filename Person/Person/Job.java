package Person;


public class Job {
	private static String[] jobList = {"Student","Teacher", "Software Engineer", "Doctor", "Lawyer", "Dentist", "Technician"};
	private int[] salaryList = {0, 35000, 95000, 120000, 90000, 80000, 50000};
	private String name;
	private int salary;
	
	public Job(int order) {
		name = jobList[order];
		salary = salaryList[order];
		
	}
	
	public static int getJobListSize() {
		return jobList.length;
	}
	
	public String getJobName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	

}
