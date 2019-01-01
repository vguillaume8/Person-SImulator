package Person;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Life {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		Machine machine = new Machine();
		Calander calander = new Calander();
		Bills bills = new Bills();
		Scanner scanner = new Scanner(System.in);
		
		
		Person[] people = new Person[2];
		for(int i = 0; i < people.length; i++) {
			people[i] = new Person((String) machine.getUserInput(input, "your name:"), 
					Integer.parseInt(machine.getUserInput(input, "your age:")));
					
		}
		int i = 0;
		int year = 0;
		people[0].setJob(new Job(machine.getRandom(Job.getJobListSize() - 1)));
		people[1].setJob(new Job(machine.getRandom(Job.getJobListSize() - 1)));
		boolean userIsPlaying = true;

		while(userIsPlaying == true) {
			while (i < 365) {
				System.out.println("----------------------------Year " + year + "-------------Day " + i + "-----------------------------------------");
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
			System.out.println("Do you want to sim another year?: [y or n]");
			String input = scanner.nextLine();
			if(input.charAt(0) == 'n'){
				userIsPlaying = false;
				continue;
			}else{
				for(int c = 0; c < people.length; c++){
					people[c].setAge(people[c].getAge() + 1);
					System.out.println(people[c].getName() + " do you want to change your job?");
					input = scanner.nextLine();
					if(input.charAt(0) == 'y'){
						changeJobs(machine, people[c], scanner);
					}else{
						if(people[c].getJob().getJobName() == "Student"){
							people[c].increaseEducationLevel();
							System.out.println(people[c].getName() + " education level increased to: " + people[c].getEducationLevel());
							System.out.println("Press a key to continue");
							scanner.nextLine();
						}
					}
				}


				year++;
				i = 0;
			}



		}
		
	
		//people[1].birthday();
		
	
			
		
		
		
		
	
	}

	public static void changeJobs(Machine machine, Person person, Scanner scanner) {
		person.setJob(new Job(machine.getRandom(Job.getJobListSize() - 1)));
		System.out.println(person.getName() + " your new job: " + person.getJob().getJobName());
		System.out.println("Press a key to continue");
		scanner.nextLine();


	}


}
