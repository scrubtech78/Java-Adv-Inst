import java.util.ArrayList;
import java.util.List;

import utility.Console;

public class WizardInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Wizard");
		
		
		displayMenu();
		
		//String command = Console.ReadLn("");
		ArrayList<String> itemsList = new ArrayList<>();
		itemsList.add("wooden staff");
		itemsList.add("wizard hat");
		itemsList.add("cloth shoes");
		
		while(true) {
			String command = Console.getString("Command: ");
			
			switch (command) {
			case "show" ->{
				show(itemsList);
				break;}
			
			case "grab" ->{
				grab(itemsList);
				break;
			}
			
			case "drop" ->{
				drop(itemsList);
				break;
			}
			
			case "edit" ->{
				edit(itemsList);
				break;
			}
			
			case "exit" ->{
				System.out.print("bye");
				System.exit(0);
			}
			
			}
			
		}		
	
			
		
		
			
		 
	}
		private static void displayMenu() {System.out.println("COMMAND MENU");
		System.out.println("CHOOSE:");
        System.out.println("show - Show all items");
        System.out.println("grab - Grab an item");
        System.out.println("edit - Edit an item");
        System.out.println("drop - Drop an item");
        System.out.println("exit - Exit program");
        System.out.println();
		
		}	
		private static void show(ArrayList<String> itemsList) {
			for(int i = 0; i < itemsList.size(); i++) {
				String item = itemsList.get(i);
				int number = i + 1;
				System.out.println(item +"=" + number);
			}
			System.out.println();
		} 
		
		private static void grab(ArrayList<String> itemsList) {
			if(itemsList.size() >=4 )
			{System.out.println("Cant carry any more items, you must drop an item");
			}
			else {String item = Console.getString("Name:");
					itemsList.add(item);
					System.out.print(item +"item was added" );
			}
			System.out.println();
		
		}

		private static void drop(ArrayList<String> itemsList) {
			int number = Console.getInt("Number: ");
			if(number <1 || number > itemsList.size()) {
				System.out.println("invalid entry try again");
			}
			 else {String item = itemsList.remove(number - 1);
			 		System.out.println(item + " was removed");}
			
		}
		
		
		private static void edit(ArrayList<String> itemsList) {
			int number = Console.getInt("Number");
			if(number <1 || number > itemsList.size()) {
				System.out.print("Invalid Entry");
			}
			else {
				String item = Console.getString("Name:");
				item = itemsList.set(number-1, item);
				System.out.println(number + " has been changed");
			}
		}
		
}



