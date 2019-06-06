package Shapes;

public class RectShape extends AbstractShape{
	public double length,width,area;

	public RectShape( double _width, double _length) {
		length = _length;
		width = _width;
		area = 0;
	}
	
	public double GetShapeArea() {
		area = length * width;
		return area;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double _length) {
		length = _length;
	}
	public double getWidth() {
		return width;
	}

	public void setWidth(double _width) {
		width = _width;
	}
}
