class Base{
    int x;
    Base(int n){
        x=n;
    }
    public int getx(){
        return x;
    }
    public void display(){
        System.out.println("x="+x);
    }
}

class Dereived extends Base{
    int y;
    Dereived(int a, int b){
        super(a);
        y=b;
    }
    public void display(){
        System.out.println("Product="+y*getx());
    }
}
public class q5 {
    public static void main(String[] args) {
        Base b = new Base(20);
        b.display();
        Dereived d = new Dereived(80, 30);

        d.display();
    }
}

