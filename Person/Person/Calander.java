package Person;




public class Calander {
	
	private static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private int currentDay;
	
	public Calander() {
		currentDay = 0;
		
	}
		
	public static String printDay(int day) {	
		return week[day];
		
	}
	
	public void incrementDay() {
		if(currentDay == 6) {
			currentDay = 0;
		}
		currentDay++;
	}
	
	public int getCurrentDay() {
		return currentDay;
	}
			
		
}
	



