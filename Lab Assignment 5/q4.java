import java.util.*;

class Box{
    int l,b,h;
    void volume(double l,double b,double h){
        double f = l*b*h;
        System.out.print("Volume:"+f);
    }
}

public class q4 {
    public static void main(String[] args) {
        Box b = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        b.volume(x,y,z);
    } 
}
