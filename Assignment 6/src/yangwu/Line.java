package yangwu;

public class Line implements Shape {

	int startX;
	int startY;
	int endX;
	int endY;// instance variables
	//four parameters: start point(startX,startY); end point(endX,endY)
	public Line(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;// set instance variables
	}
	//return its components
	public Shape[] explodeShape() {
		Shape[] shapeParts = {this};
		return shapeParts;
	}
	//draw this shape on screen
	public void renderShapeToScreen() {
		System.out.println("\nDraw a line");
		System.out.println("--------------------------------------------------------");
	}
}
