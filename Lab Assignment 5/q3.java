import java.util.*;

public class q3 {
    public static void area1(double b, double h) {
        double f = 0.5 * b * h;
        System.out.println("Area:" + f);
    }

    public static void area2(double r) {
        double f = 3.14 * r * r;
        System.out.println("Area:" + f);
    }

    public static void area3(double s) {
        double f = s * s;
        System.out.println("Area:" + f);
    }

    public static void main(String[] args) {
        int x, y, z, a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Following Operations:\n");
            System.out.print("1.Area Of Triangle\n");
            System.out.print("2.Area of Circle\n");
            System.out.print("3.Area of Square\n");
            System.out.print("4.Exit\n");
            System.out.print("Enter choice:");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Enter Base: ");
                    y = sc.nextInt();
                    System.out.print("Enter Height: ");
                    z = sc.nextInt();
                    area1(y, z);break;  
                case 2:
                    System.out.print("Enter radius: ");
                    a = sc.nextInt();
                    area2(a);
                    break;
                case 3:
                    System.out.print("Enter Side: ");
                    b = sc.nextInt();
                    area3(b);
                case 4:
                    break;
            }
        } while (x != 4);
    }
}
