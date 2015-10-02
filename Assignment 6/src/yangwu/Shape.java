package yangwu;

public interface Shape {
	
	public void renderShapeToScreen(); // draw this shape on screen

	public Shape[] explodeShape(); // return the list of all basic shapes forming this shape

}
