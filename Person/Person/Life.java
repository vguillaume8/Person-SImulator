package Person;
import java.util.Scanner;



public class Life {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Machine machine = new Machine();
		Calander calander = new Calander();
		Bills bills = new Bills();
		
		
		Person[] people = new Person[2];
		for(int i = 0; i < people.length; i++) {
			people[i] = new Person((String) machine.getUserInput(input, "your name:"), 
					Integer.parseInt(machine.getUserInput(input, "your age:")));
					
		}
		int i = 0;
		people[0].setJob(new Job(machine.getRandom(Job.getJobListSize() - 1)));
		people[1].setJob(new Job(machine.getRandom(Job.getJobListSize() - 1)));
		
		while(i< 365) {
			System.out.println("-----------------------------------------Day " + i + "-----------------------------------------");
			machine.printPeople(people);
			machine.checkPayday(people[0], calander.getCurrentDay());
			machine.checkPayday(people[1], calander.getCurrentDay());
			machine.checkPayBill(people[0], calander.getCurrentDay());
			machine.checkPayBill(people[1], calander.getCurrentDay());
			machine.checkIfBuyItem(people[0], calander.getCurrentDay());
			machine.checkIfBuyItem(people[0], calander.getCurrentDay());
	
			calander.incrementDay();
			
			
			
			i++;
			
			
			
			
		}
		
		
		
	
		//people[1].birthday();
		
	
			
		
		
		
		
	
	}

}
