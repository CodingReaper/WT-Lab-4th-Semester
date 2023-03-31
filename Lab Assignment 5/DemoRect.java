import java.util.*;

class Rectangle{
    int l,b;
    class Calculate{
        void perimeter(){
            int f = 2*(l+b);
            System.out.print("Perimeter:"+f);
        }
        void area(){
            int f = l*b;
            System.out.print("Area:"+f+"\n");
        }
    }
}

class DemoRect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle abc = new Rectangle();
        Rectangle.Calculate cdf = abc.new Calculate();
        System.out.println("Enter Length and Breadth:");
        abc.l = sc.nextInt();
        abc.b = sc.nextInt();
        cdf.area();
        cdf.perimeter();
    }
}