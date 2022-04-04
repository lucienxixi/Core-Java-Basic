package assignment3.question16;

public class Square extends AbstractShape {
    double length;

    public Square() {

    }

    public Square(double length) {
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = length * length;
        setArea(area);
    }

    @Override
    public String toString() {
        return "square area is: " + this.getArea();
    }

}
