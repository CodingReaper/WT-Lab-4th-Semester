class LessBalanceException extends Exception{
    LessBalanceException(String s){
        super(s);
    }
}

class Account{
    private int balance;
    private static int min = 500;
    
    public Account(){
        balance = min;
    }

    public void deposit(int x){
        balance = balance + x;
    }

    public void withdraw(int x) throws LessBalanceException{
        if((balance - x)<min){
            throw new LessBalanceException("Minimum Balance will be less than 500");
        }
        else{
            balance = balance -x;
        }
    }
    public int getbal(){
        return balance;
    }
}

public class q3{
    public static void main(String[] args) {
        Account ashu = new Account();
        System.out.println("Balance:"+ashu.getbal());
        ashu.deposit(1000);
        try{
            ashu.withdraw(1100);
        }
        catch(LessBalanceException e){
            System.out.println(e);
        }
    }
}