public class q5 {
    public static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } 
            else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
    public static void decToBinary(int n)
    {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String args[]) {
        System.out.println("Decimal of 1110 is: " + getDecimal(1110));
        // System.out.println("Decimal of 10101 is: " + getDecimal(10101));
        // System.out.println("Decimal of 11111 is: " + getDecimal(11111));
        System.out.print("Decimal of 12 :");
        decToBinary(12);
    }
}
