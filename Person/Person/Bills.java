package Person;
import java.util.*;


public class Bills {
	//private static String[] billName = {"Rent", "Food", "Insurance", "Gas", "Electricity", "Water", "Cable"};
	//private static int[] billAmount = {1200, 300, 200, 100, 75, 50, 88};
	static Map<Integer, String> billName = new HashMap<Integer, String>();
	static Map<Integer, Integer> billAmount = new HashMap<Integer, Integer>();
	static int billCounter = 6;

	
	
	
	public Bills() {
		billName.put(0, "Rent");
		billName.put(1, "Food");
		billName.put(2, "Insurance");
		billName.put(3, "Gas");
		billName.put(4, "Electricity");
		billName.put(5, "Water");
		billName.put(6, "Cable");
		
		billAmount.put(0, 1200);
		billAmount.put(1, 300);
		billAmount.put(2, 200);
		billAmount.put(3, 100);
		billAmount.put(4, 75);
		billAmount.put(5, 50);
		billAmount.put(6, 88);
	
	}
	
	public String printBillName(int order) {
		printAmount(order); 
		return billName.get(order);
	}
	
	public static int printAmount(int order) {
		return billAmount.get(order);
	}
	
	public static Map<Integer, String> getListOfBills() {
		return billName;
	}
	
	public static int getListOfBillsLength() {
		return billName.size();
	}
	
	public static int getAmount(int amount) {
		return billAmount.get(amount);
		
		
	}
	
	
 	public static void addBill(String name, int amount) {
 		billCounter++;
		billName.put(billCounter, name);
		billAmount.put(billCounter, amount);
		
	}
 	

}
