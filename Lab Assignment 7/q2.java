

class A{
    void xd(){
        System.out.println("A-XD");
    }
}

class B extends A{
    void xd(){
        System.out.println("B-XD");
    }
}

class C extends A{
    void xd(){
        System.out.println("C-XD");
    }
}

public class q2 {
    public static void main(String[] args) {
        A a = new A();B b = new B();
        C c  = new C();
        A r;
        r = a;
        r.xd();
        r = b;
        r.xd();
        r = c;
        r.xd();
    } 
}
