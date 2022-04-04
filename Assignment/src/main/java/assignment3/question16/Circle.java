package assignment3.question16;

public class Circle extends AbstractShape {
    double radius;

    public Circle() {

    }

    public Circle(double radius) {
        setLength(radius);
    }

    public double getLength() {
        return radius;
    }

    public void setLength(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = radius * radius * Math.PI;
        setArea(area);
    }

    @Override
    public String toString() {
        return "circle area is: " + this.getArea();
    }
}
