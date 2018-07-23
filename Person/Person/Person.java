package Person;
import bankAccount.*;
import java.util.Random;

public class Person {
	
	private String name;
	private int age;
	private bankAccount yourAccount;
	private Job job;
	private House house;
	Random random = new Random(System.nanoTime());

	
	public Person(String aname, int aage) {
		name = aname;
		age = aage;
		new Job(0);
		yourAccount = new bankAccount();
		house = new House(random.nextInt(6));
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setJob(Job newJob) {
		job = newJob;
	}
	
	public Job getJob() {
		return job;
	}
	
	public double getBankAccountBalance() {
		return yourAccount.getBalance();
		
		
	}
	
	public void addBankAccountBalance(int amount) {
		yourAccount.deposit(amount);
	}
	
	public void subtractBankAccountBalance(int amount) {
		yourAccount.withdraw(amount);
	}
	
	public void birthday() { 
		age++;
		System.out.println("Happy Birthday " + name + "!!! You are now " + age + " years old!" );
	}
	
	public House getHouse() {
		return house;
	}
	
	

}
