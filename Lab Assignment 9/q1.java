class HrsException extends Exception{
    HrsException(String s){
        super(s);
    }
}

class MinException extends Exception{
    MinException(String s){
        super(s);
    }
}

class SecException extends Exception{
    SecException(String s){
        super(s);
    }
}

class Time{
    int h,min,sec;
    Time(int x,int y,int z){
        h=x;
        min=y;
        sec=z;
    }
    void display() throws HrsException,MinException,SecException{
        if(h<0 || h>24){
            throw new HrsException("Invalid Hours");
        }
        else{
            System.out.println("Hrs:"+h);
        }
        if(min<0 || min>60){
            throw new HrsException("Invalid Minute");
        }
        else{
            System.out.println("Min:"+min);
        }
        if(sec<0 || sec>60){
            throw new HrsException("Invalid Seconds");
        }
        else{
            System.out.println("Secs:"+sec);
        }
    }
}

public class q1{
    public static void main(String[] args) {
        Time ashu = new Time(1,20,65);
        try{
            System.out.println("The Time is:");
            ashu.display();
        }
        catch(HrsException x){
            System.out.println(x);
        }
        catch(MinException y){
            System.out.println(y);
        }
        catch(SecException z){
            System.out.println(z);
        }
    }
}