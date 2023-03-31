// // // // public class prc{
// // // //     public static void main(String[] args) {
// // // //         int x;
// // // //         x = 10;
// // // //         if(x==10){
// // // //             int y =20;
// // // //             System.out.println("x and y:"+x+" "+y);
// // // //             x = y* 2;
// // // //         }
// // // //         System.out.println(x);
// // // //         byte a = 40;
// // // //         byte b = 50;
// // // //         byte c = 100;
// // // //         int d = a*b/c;

// // // //         System.out.println(d);
// // // //     }
// // // // }

// // // class A{
// // //     int i;
// // //     int j;
// // //     void setij(int x,int y){
// // //         i = x;
// // //         j  =y;
// // //     }
// // //     public int getj(){
// // //         return j;
// // //     }
// // // }

// // // class B extends A{
// // //     int j=10;
// // //     void sum(){
// // //         System.out.println(i*j);
// // //     }
// // // }

// // // public class prc{
// // //     public static void main(String[] args) {
// // //         A b = new A();
// // //         B a = new B();
// // //         a.setij(5, 5);
// // //         b = a;
// // //         a.sum();
// // //     }
// // // }

// // class A {
// //     private int x;

// //     A(int n) {
// //         x = n;
// //     }

// //     public int getX() {
// //         return x;
// //     }

// // public void displayA () {System.out.println("x} // End of class A
// //       // constructor of class A

// //     class B extends A {
// //         int y;

// //         B(int a, int b) // constructor of subclass
// //         {
// //             super(a);
// //             y = b;
// //         }

// // public void displayB() { System.out.println("Productb
// // // End of class B
// // // inheriting class B
// // }

// //         class C extends B {
// //   private int z;

// // C (int m, int n, int p)
// // (super (m,n);
// // }z=p;
// //         }

// // public void displayC() { System.out.println("Productc
// // // End of class C
// // // use of super in constructor of B
// // A objA = new A (10);
// // objA.displayA();
// // B objB = new B( 20, 20);
// // objB.displayB();
// // }x);
// //     }

// //     public class MultiLevel1 { // class with main method
// // public static void main(String[] args) {
// // C objC = new C(5,10,30);
// // objc.displayC();
// // =
// // =
// // // inheriting class A
// // y* getx ());}+

// //   getX()*super.y*z); }

// class prc {

//     public static void main(String args[]) {

//         int twoD[][] = new int[4][];

//         twoD[0] = new int[1];

//         twoD[1] = new int[2];

//         twoD[2] = new int[3];

//         twoD[3] = new int[4];

//         int i, j, k = 0;

//         for (i = 0; i < 4; i++)
//             for (j = 0; j < i + 1; j++) {
//                 twoD[i][j] = k;
//                 k++;
//             }
//         for (i = 0; i < 4; i++) {
//             for (j = 0; j < i + 1; j++)
//                 System.out.print(twoD[i][j] + " ");
//             System.out.println();
//         }
//         main();
//     }
//     public static void main(){
//         System.out.println("ashu");
//     } 
// }
import java.util.*;
public class prc{
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Abdul");
        s.append("Kalam");
        System.out.println(s);

    }
}

