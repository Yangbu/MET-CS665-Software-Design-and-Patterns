package yangwu;

public class Triangle implements Shape {

	Shape[] components = new Shape[3];
	//six parameters: first point(x1,y1); second point(x2,y2); third point(x3,y3)
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		//construct the triangle
		components[0] = new Line(x1, y1, x2, y2);
		components[1] = new Line(x1, y1, x3, y3);
		components[2] = new Line(x2, y2, x3, y3);
	}
	// draw this shape on screen
	@Override
	public void renderShapeToScreen() {
		System.out.println("\nDraw a triangle(composed with 3 lines)");
		//output its components
		for (int i = 0; i < explodeShape().length; i++) {
			System.out.println("\nDraw the line " + (i + 1) + " of the triangle.");
		}
		System.out.println("\nThe triangle is done.");
		System.out.println("--------------------------------------------------------");
	}
	//return its components
	@Override
	public Shape[] explodeShape() {
		return components;
	}

}
