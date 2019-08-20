/*Manpreet Singh Sandhu
 * C0747450
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args)   {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		
		//arrayList of type shape
		ArrayList<Shape> Shapes= new ArrayList<Shape>();
		
		while (choice != 3) {
			// 1. show the menu
			showMenu();
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter the height of Trinagle");
				double heightInput = keyboard.nextDouble();	
				
				System.out.println("Enter the base of Trinagle");
				double baseInput = keyboard.nextDouble();
				
				System.out.println("Enter the color of Trinagle");
				String colorInput = keyboard.nextLine();
				
				Traingle T= new Traingle(baseInput,heightInput,colorInput);
				T.calculateArea();
				T.printInfo();
				Shapes.add(T);
			}
			
			else if(choice==2)
			{
				System.out.println("Enter the side of Square");
				double sideInput = keyboard.nextDouble();
				
				System.out.println("Enter the color of Square");
				String colorInput = keyboard.nextLine();
				
				Square S= new Square(sideInput,colorInput);
				S.calculateArea();
				S.printInfo();
				Shapes.add(S);
			}
			else if(choice==3)
			{
				System.out.println("Thank You, Bye!");
			}
			else
			{
				System.out.println("Enter a valid choice");
			}
			
			
			// 3. DEBUG: Output what the user typed in 
			System.out.println("You entered: " + choice);
			
			
		
			keyboard.close();
		}
	}
	
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

}
