
public class Square implements TwoDimensionalShapeInterface{
	private double side;
	private double area;

	//constructor
	public Square(double side) {
		this.side=side;
	}
	
	
//area calculating method
	public double calculateArea()
	{
		this.area= this.side* this.side;
		return area;
	}
	
	public void printInfo() {
		System.out.println("The area of the square is: "+ this.area);
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
	

}
