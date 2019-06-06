import java.awt.Point;

import Models.Color;
import Shapes.AbstractShape;

public class Ball {
	private double moveSize;
	
	public Color color;
	public AbstractShape ballShape;
	public Point currPosition;
	public Direction currDirection;
	
	public Ball(Color _color, AbstractShape ball, Point startingPos, Direction startingDir, double _moveSize) {
		color = _color;
		ballShape = ball;
		currPosition = startingPos;
		currDirection = startingDir;
		moveSize = _moveSize;
	}
	
	public void Move() {
		currPosition.x += Math.cos(currDirection.getValue()) * moveSize;
	}
	
	
}
