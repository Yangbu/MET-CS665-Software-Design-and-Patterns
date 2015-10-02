package yangwu;

public class Arrow implements Shape {

	Shape[] components = new Shape[4];
	//four parameters: start point:(startX,startY); length of line: length; width of arrow: arrowwidth
	public Arrow( int startX, int startY, int length, int arrowwidth){
		//construct the arrow
		components[0] = new Line(startX, startY, length, startY);
		components[1] = new Line(startX + length, startY - (arrowwidth >> 1),
				startX + length, startY + (arrowwidth >> 1));
		components[2] = new Line(startX + length, startY - (arrowwidth >> 1),
				startX + length + arrowwidth, startY);
		components[3] = new Line(startX + length, startY + (arrowwidth >> 1),
				startX + length + arrowwidth, startY);
	}
	// draw this shape on screen
	@Override
	public void renderShapeToScreen() {
		System.out.println("\nDraw an Arrow(composed with a line and a triangle)");
		//output its components
		for (int i = 0; i < explodeShape().length; i++) {
			System.out.println("\nDraw the line " + (i + 1) + " of the Arrow.");
		}
		System.out.println("\nThe arrow is done.");
		System.out.println("--------------------------------------------------------");
	}
	//return its components
	@Override
	public Shape[] explodeShape() {
		return components;
	}

}
