package main;

//import java.math.BigDecimal;
import java.util.Scanner;


public class Converter {
	
	
	public static void main (String[]args) {
		
		int menuSelection;
		double pounds;
		double kilograms;
		int whileLoopConditional;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to Unit Converter. Press any number key from 1-9 then press ENTER to continue, or press 0 and then ENTER "
				+ "to exit the program.");
		System.out.println();
		whileLoopConditional = sc.nextInt();
		
		while (whileLoopConditional != 0) { //this selection allows the user to exit the program if they opened it by mistake
			// user can still terminate the while loop from the menu that will appear if they wish to continue. 
		

	
	//public void menu() {

			
	System.out.println("Please select an option.");
	System.out.println("1. Pounds to Kilograms");
	System.out.println("2. Kilograms to pounds");
	System.out.println("3. Quit application and exit.");
	menuSelection = sc.nextInt();
	sc.nextLine();
	
	switch (menuSelection) {
	case 1: 
		System.out.println("Enter weight in pounds to convert.");
		pounds = sc.nextDouble();
		double convertedToKilograms = pounds * 0.45;
		System.out.println("You entered: " + pounds + " pounds. " +  pounds  + " pounds is equivalent to " + convertedToKilograms + " kilograms.");
	
		
			System.out.println("Press \"ENTER\" to continue.");
			Scanner enterkey = new Scanner(System.in);
			enterkey.nextLine();
		
		break;
		
	case 2:
		System.out.println("Enter weight in kilograms to convert.");
		kilograms = sc.nextDouble();
		double convertedToPounds = kilograms * 2.20;
		System.out.println(kilograms + " kilograms is equivalent to " + convertedToPounds + " pounds.");
		System.out.println("Press \"ENTER\" to continue.");  //require user to press enter to continue to next line
		Scanner enterkey1 = new Scanner(System.in);
		enterkey1.nextLine();
		break;
		
	case 3:
		System.out.println("You have chosen to exit the Unit Converter application.");
		whileLoopConditional = 0; //allows while loop to terminate since last menu option has been selected
		
		break;
		
		default:
			System.out.println("Sorry, you have entered an invalid input choice.");//error message for invalid number entry
			System.out.println("Press \"ENTER\" to continue.");
			//requires user to press enter to continue
			Scanner enterkey11 = new Scanner(System.in);
			enterkey11.nextLine();
			
	}
	//S


		
	}
		System.out.println("Thank you for using Unit Converter. Goodbye!");
	
	
	
	

	}


	}


	

		
		
		
		
	

	
	



