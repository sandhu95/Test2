/*Manpreet Singh Sandhu
 * C0747450
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args)   {
		Scanner keyboard = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner inputColor= new Scanner(System.in);
		int choice = 0;
		
		//arrayList of type shape
		ArrayList<Shape> Shapes= new ArrayList<Shape>();
		
		try
		{
		while (choice != 3) {
			// 1. show the menu
			showMenu();
			System.out.println();
	
			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter the height of Trinagle");
				double heightInput = input.nextDouble();	
				
				System.out.println("Enter the base of Trinagle");
				double baseInput = input.nextDouble();
				
				System.out.println("Enter the color of Trinagle");
				String colorInput = inputColor.nextLine();
				
				Traingle T= new Traingle(baseInput,heightInput,colorInput);
				T.calculateArea();
				T.printInfo();
				Shapes.add(T);
			}
			
			else if(choice==2)
			{
				System.out.println("Enter the side of Square");
				double sideInput = input.nextDouble();
				
				System.out.println("Enter the color of Square");
				String colorInput = inputColor.nextLine();
				
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
		System.out.println();
		
		}
		}
		catch(Exception e)//handling the exceptions
		{
			System.out.println("sorry, you entered wrong type of value.");
		}
		
		if(Shapes.size()>0)
		System.out.println("information of all the Shapes entered is as given below:");
		
		System.out.println();
		
		//printing the elements of the arrayList
		for(int i=0; i<Shapes.size();i++) {
			if(Shapes.get(i).getCheck()==1)
			{
				Square S1=(Square) Shapes.get(i);
				S1.printInfo();
				System.out.println();
			}
			if(Shapes.get(i).getCheck()==2)
			{
				Traingle S2=(Traingle) Shapes.get(i);
				S2.printInfo();
				System.out.println();
			}
		}
		
		keyboard.close();
		input.close();
		inputColor.close();
	}
	
	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

}
