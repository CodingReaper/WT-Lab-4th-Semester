import java.util.*;
public class q6
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int r,n,s=0;
        n=a;
        while(a>0)
        {
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        if(s==n)
            System.out.println("Palindrome no "+s);
        else 
            System.out.println("Not a Palindrome no "+s);
    }
       
}
