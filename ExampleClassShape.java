
public class ExampleClassShape {
	
	public String color;
	public int sides;
	public boolean shape = true;
	
	public ExampleClassShape(String color, int sides, boolean shape) {
		this.color = color;
		this.sides = sides;
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public boolean isShape() {
		return shape;
	}

	public void setShape(boolean shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "ExampleClassShape [color=" + color + ", sides=" + sides + ", shape=" + shape + "]";
	}
	
	public static void main(String[] args) {
		ExampleClassShape square = new ExampleClassShape("red", 4, true);
		System.out.println("NEW SQUARE CREATED: " + square.toString());
	}
	
}
