package guru.qa.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static guru.qa.lesson15.Point.xComparator;
import static guru.qa.lesson15.Point.yComparator;

public class Arrays {

    public static void main(String[] args) {

        Point point1 = new Point(23, 4);
        Point point2 = new Point(7, 7);
        Point point3 = new Point(1, 5);
        Point point4 = new Point(9, 2);

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.remove(1);

        Collections.sort(points);
        for (Point i : points) {
            System.out.println(i);
        }

        System.out.println();
        points.sort(xComparator);
        for (Point i : points) {
            System.out.println(i);
        }

        System.out.println();
        points.sort(yComparator);
        for (Point i : points) {
            System.out.println(i);
        }
    }
}

