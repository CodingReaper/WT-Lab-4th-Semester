import java.util.*;

class plate{
    int l,w;
    plate(int x,int y){
        l=x;
        w=y;
        System.out.println("multiply:plate");
    }
    // void display(){
    //     System.out.print(l);
    // }
}

class box extends plate{
    int l,w,h;
    box(int x,int y,int z){
        super(x, y);
        h = z;
        System.out.println("multiply:box");
    }
}
class woodbox extends box{
    int l,w,h,t;
    woodbox(int x,int y,int z,int a){
        super(x, y, z);
        t = a;
        System.out.println("multiply:woodbox");
    }
}


public class q3 {
    public static void main(String args[]){
        woodbox xd = new woodbox(1, 2, 3, 4);
        // xd.display();
    }
}
