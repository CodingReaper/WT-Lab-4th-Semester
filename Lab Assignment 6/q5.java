import java.util.*;
public class q5{
    int x;
    int y;
    q5(){
        x=y=0;
    }
    q5(int a){
        x = a;
    }
    q5(int a,int b){
        x = a;
        y = b;
    }
    void display(){
        System.out.println("x="+x+"y="+y);
    }
    void display(int n) {
        System.out.println("x + y = " + (x + y + n));
    }
    void display(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        q5 ashu = new q5();
        ashu.display();
        q5 obj2 = new q5(5);
        obj2.display();
        q5 obj3 = new q5(4,6);
        obj3.display();
        obj3.display("Ashu");
    }
}


