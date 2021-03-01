package Java.Point;

import java.util.ArrayList;

public class PointDriver {

    public static void main(String[] args) {

        ArrayList<Point> point = new ArrayList<Point>();

        point.add(new Point());
        point.add(new Point(1.0, 2.0));
        point.add(new Point(3.0, 4.0));
        System.out.println(point);

        System.out.println("Midpoint of point 1 and 2: " + point.get(0).midpoint(point.get(1)));
        System.out.println("Distance of point 1 and 3: " + point.get(0).distance(point.get(2)));
        System.out.println("Are those 3 points collinear: " + point.get(0).isCollinear(point.get(1), point.get(2)));
    }
}
