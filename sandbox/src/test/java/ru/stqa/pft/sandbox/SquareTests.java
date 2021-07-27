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
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        Assert.assertEquals(Point.distance(p1, p2), 0.0);
        ;
    }

    @Test
    public void testDistanceTwo() {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(20, 20);

        Assert.assertNotEquals(Point.distance(p1, p2), 0.0);
    }
}
