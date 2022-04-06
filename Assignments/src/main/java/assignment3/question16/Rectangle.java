package assignment3.question16;

public class Rectangle extends AbstractShape {
    double length;
    double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        setArea(area);
    }

    @Override
    public String toString() {
        return "rectangle area is: " + this.getArea();
    }
}
