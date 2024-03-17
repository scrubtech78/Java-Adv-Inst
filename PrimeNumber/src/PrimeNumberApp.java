import java.util.Scanner;

import utility.Console;

public class PrimeNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Prime Numbers");
		Scanner sc= new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		System.out.println("Enter a number between 1 and 5000");
		int   number = Console.getInt(choice, 0, 5001);
		List<Integer> factorList = new ArrayList<>();
		
		for(int i = 1; i<=5000; i++) {
			if(number % i == 0) {
				factorsList.add(i);
				
			}
			if(factorsList.size()==2) {
				System.out.println();
			}
	
	}
	
	
	}
}
