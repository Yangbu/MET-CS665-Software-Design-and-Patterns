package yangwu;

public class Rectangle implements Shape{

	Shape[] components = new Shape[4];
	//four parameters: start point:(startX,startY); length of rectangle:length; width of rectangle:width
	public Rectangle(int startX, int startY, int length, int width){
		//construct the rectangle
		components[0] = new Line(startX, startY, length, startY);
		components[1] = new Line(startX, startY, startX, width);
		components[2] = new Line(startX, startY + width, startX + length, startY + width);
		components[3] = new Line(startX + length, startY, startX + length, startY + width);
	}
	// draw this shape on screen
	@Override
	public void renderShapeToScreen() {
		System.out.println("\nDraw a Rectangle(composed with 4 lines)");
		//output its components
		for (int i = 0; i < explodeShape().length; i++) {
			System.out.println("\nDraw the line " + (i + 1) + " of the rectangle.");
		}
		System.out.println("\nThe rectangle is done.");
		System.out.println("--------------------------------------------------------");
	}
	//return its components
	@Override
	public Shape[] explodeShape() {
		return components;
	}
}
