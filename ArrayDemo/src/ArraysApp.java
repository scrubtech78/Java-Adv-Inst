
public class ArraysApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
		//array of int
		int[] monthsOfYear= new int[12];
		monthsOfYear[0]= 1;
		monthsOfYear[2]=2;
		monthsOfYear[3]=3;
		monthsOfYear[4]=4;
		monthsOfYear[5]=5;
		monthsOfYear[6]=6;
		monthsOfYear[7]=7;
		monthsOfYear[8]=8;
		monthsOfYear[9]=9;
		monthsOfYear[10]=10;
		monthsOfYear[11]=11;
		monthsOfYear[12]=12;
		
		for(int i=0; i<monthsOfYear.length; i++) {
			System.out.println("i = " +i+ "Month = "+ monthsOfYear);
		}
		double[] prices = {5.99, .99, 12.50,100.25,11.11};
		
		for(double price: prices) {
			System.out.println("Price = " +price);
		}
		prices[1] = 6.99;
		// array of double
		
		//array of Strings
		
		
		
		
		
		System.out.println("bye");

	}

}
