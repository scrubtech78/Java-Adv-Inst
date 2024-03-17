import java.util.ArrayList;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		displayUserNames();
		
		
		
	User u1 = new User();
	u1.setFirstname("Bob");
	User u2 = new User();
	u2.setFirstname("Sally");
	User u3 = new User();
	u3.setFirstname("Gena");
	
	ArrayList<Integer> evenNumbers = new  ArrayList<>();
	evenNumbers.add(0);
	evenNumbers.add(6);
	for(int i: evenNumbers) {
		System.out.println("Even number:"+i);
	}
	ArrayList<User> userNames = new ArrayList<>();
	userNames.add(u1);
	userNames.add(u2);
	userNames.add(u3);
	
	}
	private static void displayUserNames(ArrayList<User> userNames) {
		for(int i = 0; i < userNames.size(); i++) {
			User names = userNames.get(i);
			System.out.println(names);
		
		}
	}
}
