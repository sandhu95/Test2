/*Manpreet Singh Sandhu
 * C0747450
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 4) {
			// 1. show the menu
			showMenu();
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			// 3. DEBUG: Output what the user typed in 
			System.out.println("You entered: " + choice);
			System.out.println();
			keyboard.close();
		}
	}
	
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		System.out.println("4. Exit");
	}

}
