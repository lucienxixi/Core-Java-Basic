package assignment3.question16;

public abstract class AbstractShape {
    double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calculateArea();
}
