package ru.stqa.pft.sandbox;

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
        Point p = new Point(1, 2, 3, 4);
        System.out.println(p.distance());
    }

}