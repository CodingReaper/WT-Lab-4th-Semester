import java.util.*;
public class q1 {
    public static void main(String args[]){
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        a = sc.nextInt();
        System.out.println("Enter Second number:");
        b = sc.nextInt();
        System.out.println("Enter Third number:");
        c = sc.nextInt();
        d = a>b?a:b;
        e = c>d?c:d;
        System.out.println("Largest is:"+e);
    }
}
