package ru.stqa.pft.sandbox;


import static ru.stqa.pft.sandbox.Point.distance;

public class MyFirstProgram {

//        public static void main(String[] args) {
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


    //    Задание 2
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(1.0, 1.0);

        System.out.println(distance(p1, p2));
    }
}