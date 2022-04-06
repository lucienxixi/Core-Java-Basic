package assignment3.question16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public void demo() {
        AbstractShape square = new Square(10.5);
        square.calculateArea();

        AbstractShape rectangle = new Rectangle(3.5, 6.5);
        rectangle.calculateArea();

        AbstractShape circle = new Circle(4.7);
        circle.calculateArea();

        List<AbstractShape> shapeList = new ArrayList<>();
        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(circle);

        System.out.println("shape list is shown as: ");
        System.out.println(shapeList);

        Collections.sort(shapeList, new Comparator<AbstractShape>() {
            @Override
            public int compare(AbstractShape s1, AbstractShape s2) {
                return Double.compare(s1.getArea(), s2.getArea());
            }
        });

        System.out.println("shape list is sorted by area: ");
        System.out.println(shapeList);
    }
}
