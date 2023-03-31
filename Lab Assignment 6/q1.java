import java.util.*;

public class q1 {
    static int fibonacci(int x){
        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String args[]){
        for(int i=0;i<12;i++){
            System.out.print(fibonacci(i)+"  ");
        }
    }
}
