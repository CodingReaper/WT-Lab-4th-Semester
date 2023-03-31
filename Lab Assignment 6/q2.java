import java.util.*;

abstract class Shape{
    double area;
    abstract void showarea();
}

class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    double radius;
    void showarea(){
        System.out.print("Enter Radius:");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area:"+area);
    }
}

class Rectangle extends Shape{
    double length,breadth;
    Scanner sc = new Scanner(System.in);
    void showarea(){
        System.out.print("Enter Length:");
        length = sc.nextDouble();
        System.out.print("Enter Breadth:");
        breadth = sc .nextDouble();
        area = length * breadth;
        System.out.println("Area:"+area);
    }
}

public class q2 {
    public static void main(String args[]){
        Shape xd = new Circle();
        xd.showarea();
        Shape xdd = new Rectangle();
        xdd.showarea();
    }
}
