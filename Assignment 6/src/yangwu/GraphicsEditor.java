package yangwu;

import java.util.ArrayList;

public class GraphicsEditor {
	ArrayList<Shape> allShapes = new ArrayList<>();
	 
	public GraphicsEditor() {}	
	//add shapes to the ArrayList
	public void addShape(Shape shape){
		allShapes.add(shape);
	}
	//traversal
	public void printShapes() {
		for (Shape shape : allShapes) {
			shape.renderShapeToScreen();
		}
	}
	
	public static void main(String[] args) {
		//deal with different shapes
		Shape line = new Line(1, 1, 5, 1);
		Shape rectangle = new Rectangle(2, 2, 8, 8);
		Shape arrow = new Arrow(12, 12, 10, 2);
		Shape triangle = new Triangle(20, 20, 30, 30, 40, 40);
		GraphicsEditor editor = new GraphicsEditor();
		editor.addShape(line);
		editor.addShape(rectangle);
		editor.addShape(arrow);
		editor.addShape(triangle);
		editor.printShapes();
	}
}
