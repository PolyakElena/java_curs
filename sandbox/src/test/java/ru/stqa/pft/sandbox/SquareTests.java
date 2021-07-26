package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

//    @Test
//    public void testArea() {
//        Square s = new Square(5);
//        Assert.assertEquals(s.area(), 25.0);;
//    }

    //    Задание 3
    @Test
    public void testDistanceOne() {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x1 = 1;
        p1.y1 = 1;
        p2.x2 = 1;
        p2.y2 = 1;

        Assert.assertEquals(Point.distance(p1, p2), 0.0);
        ;
    }

    @Test
    public void testDistanceTwo() {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x1 = 4;
        p1.y1 = 4;
        p2.x2 = 20;
        p2.y2 = 20;

        Assert.assertNotEquals(Point.distance(p1, p2), 0.0);
    }
}
