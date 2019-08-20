
public class Square {
	private int side;

	//constructor
	public Square(int side) {
		this.side=side;
	}
	
	
//area calculating method
	public void calculateArea()
	{
		int area= this.side* this.side;
		System.out.println("The area of the square is: "+ area);
	}

	
	//getters and setters
	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}

}
