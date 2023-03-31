import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int flag = 1;
        String B = A.toUpperCase();
        for(int i=0;i<B.length();i++){
            if(B.charAt(i) != B.charAt(A.length()-i-1)){ //n-i-1
                flag=0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("NOT a Palindrome String");
        }
    }
    
}
