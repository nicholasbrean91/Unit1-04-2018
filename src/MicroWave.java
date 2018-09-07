import java.io.InputStream; 
import java.util.Scanner;

public class MicroWave {
	public static void main(String args[]){
		Scanner UserInput = new Scanner( System.in );
		//Declare variables
		double sub;
		double pizza;
		double soup;
		double time;
		int NumOfFood;
		//Time in seconds
		sub = 60;
		pizza = 45;
		soup = 105;
		//Ask User What food they want
		System.out.print("Are you heating a sub, pizza or soup?");
		//Put in what food they want
		String food = UserInput.nextLine();
		//Put how many of the food they want
		System.out.print("How many pieces of " + food + " are you eating?: ");
		NumOfFood = UserInput.nextInt();
		
		if (NumOfFood > 3) {
			System.out.println("That is too much " + food + " It wont fit in the microwave");
			System.exit(0); 
		}
			

		
		
		//System.out.println(NumOfFood);
		

		
		
		
		
		
		
		
	}

}
