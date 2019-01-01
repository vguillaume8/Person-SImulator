package Person;
import bankAccount.*;
import java.util.Random;
import java.util.Scanner;



public class Machine {
	Job job = new Job(0);
	
	public Machine() {
		
		
	}
	
	public int getRandom(int size) {
		Random random = new Random(System.nanoTime());
		return random.nextInt(size);
	}
	
	
	public void getJob(Person person) {
		person.setJob(new Job(getRandom(Job.getJobListSize())));
	
	}
	
	public String getUserInput(Scanner input, String value) {
		System.out.println("Please enter " + value);
		//System.out.println();
		return input.nextLine();
		
	}
	
	public void buyItem(Person person) {
		String itemName = Item.printItemName(getRandom(Item.getListOfItems().size() - 1));
		person.getHouse().addItem(new Item(itemName));
		int amountInd = Item.getItemInd(itemName);
		System.out.println(person.getName() + " just bought a " + itemName + " for $" + Item.getItemAmount()[amountInd]);
	}
	
	public boolean playGame(Scanner input) {
		System.out.println("Press 0 to end game");
		int answer = 1;
		return answer == input.nextInt();
		
			
	}
	
	public void checkIfBuyItem(Person person, int day) {
		if(Calander.printDay(day) == "Monday") {
			if(person.getBankAccountBalance() > 500) {
				if(person.getHouse().itemCounter < person.getHouse().getHouseSpace()) {
					buyItem(person);
				}
				
			}
		}
	}
	
	public void checkPayBill(Person person, int day) {
		if(Calander.printDay(day) == "Sunday") {
			payBill(person);
			
		}
		
	}
	
	public void payBill(Person person) {
		int amountKey = getRandom(Bills.getListOfBillsLength());
		int amount = Bills.getAmount(amountKey);
		person.subtractBankAccountBalance(amount);
		System.out.println(person.getName() + " just payed " + Bills.billName.get(amountKey) + " $" + amount);
		
	}
	
	public void checkPayday(Person person, int day) {
		if(Calander.printDay(day) == "Friday") {
			payDay(person);
		}
	}
	

	public void payDay(Person person) {
		person.addBankAccountBalance(person.getJob().getSalary() / 52);
		System.out.println(person.getName() + " just got payed $" + person.getJob().getSalary() / 52);
	}
	
	public void printPeople(Person[] people) {
		for(int i = 0; i < people.length; i++) {
			System.out.println("["+people[i].getName() + ": " + people[i].getAge() + " years old " + people[i].getJob().getJobName() + 
					" $" + people[i].getBankAccountBalance() + "]");
		}
		
	}
	

}
