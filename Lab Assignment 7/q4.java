
public class q4 {
    public static void main(String[] args) {
        int mat1[][] = {{1,2,3},{2,3,4},{5,6,7}};
        int mat2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix1:");
        int mat3[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMatrix2:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat2[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMultiplied Matrix:");
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                mat3[i][j] = 0;
                for(int k=0;k<3;k++){
                    mat3[i][j] += mat1[i][k]*mat2[k][j];
                }
                System.out.print(mat3[i][j]+" ");  
            }
            System.out.println();
        }
    } 
}
