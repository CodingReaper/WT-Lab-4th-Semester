import java.util.*;

class Account {
    public int accno;
    public float balance;

    public Account() {
        accno = 0;
        balance = 0;
    }

    public Account(int a, float b) {
        accno = a;
        balance = b;
    }

    public void withdraw(int w) {
    balance = balance - w;
    }

    public void deposit(int d) {
       balance = balance + d;
        System.out.print(balance);
    }  
}

class Calculate extends Account {
    public int r, t;
    public float si, amt;
    public Calculate(){
        this.r = t =0;
        this.si =0;
    }
    public void accept(int x, int y) {
        this.r = x;
        this.t = y;
        this.amt = 0;
    }
    public void compute() {
        this.si = (super.balance * this.r * this.t) / 100;
        this.amt = this.amt + this.si;
    }
    public void display() {
        System.out.println("AccountNumber:" + accno);
        System.out.println("Balance:" + balance);
        System.out.println("iNTERERST:" + r);
        System.out.println("Amount:" + amt);
    }
}

public class q4 {
    public static void main(String args[]) {
        Account ashu = new Account(1112, 20000);
        ashu.withdraw(1000);
        ashu.deposit(2000);
        Calculate xd = new Calculate();
        xd.display();
    }
}


