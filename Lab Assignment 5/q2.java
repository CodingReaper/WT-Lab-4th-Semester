import java.util.*;
public class q2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x=0,y=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                x=x+1;
            }
            else{
                y++;
            }
        }
        System.out.print("Even Numbers :"+x+"\n");
        System.out.print("Odd Numbers :"+y);
    }
}
