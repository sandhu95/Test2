
public class Square extends Shape implements TwoDimensionalShapeInterface{
	
	//properties
	private double side;
	private double area;
	private String color;

	//constructor
	public Square(double side,String color) {
		this.side=side;
		this.color=color;
	}
	
	
//area calculating method
	public double calculateArea()
	{
		this.area= this.side* this.side;
		return area;
	}
	
	public void printInfo() {
		System.out.println("The area of the square is: "+ this.area);
		System.out.println("The color of the traingle is: "+ this.color);
		System.out.println("The dimensions of the traingle are: ");
		System.out.println("Side: "+ this.side);
	}


	
	//getters and setters
	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
