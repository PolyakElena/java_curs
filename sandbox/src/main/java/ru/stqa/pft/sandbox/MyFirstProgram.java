package ru.stqa.pft.sandbox;


import static ru.stqa.pft.sandbox.Point.distance;

public class MyFirstProgram {

    //    public static void main(String[] args) {
//        hello("world");
//        hello("Elena");
//
//        Square s = new Square(5);
//        System.out.println("S = " + s.area());
//
//        Rectangle r = new Rectangle(4, 6);
//        System.out.println("S = " + r.area());
//    }
//
//    public static void hello(String name) {
//        System.out.println("Hello, " + name + "!");
//    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x1 = 1;
        p1.y1 = 1;
        p2.x2 = 1;
        p2.y2 = 1;

        System.out.println(distance(p1, p2));
    }

}