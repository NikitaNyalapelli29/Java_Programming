import java.util.Scanner;
public class AdditionTwoMatricesUserInput{
  public static void main(String[] args){
    // taking from user input for adding two matrices

        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2, i, j, p, k;
        System.out.print("Enter first matrix number of row: ");
        r1 = sc.nextInt();

        System.out.print("Enter second matrix number of column: ");
        c1 = sc.nextInt();
        int[][] fm = new int[r1][c1];

        System.out.print("Enter second matrix number of row: ");
        r2 = sc.nextInt();

        System.out.print("Enter second matrix number of column: ");
        c2 = sc.nextInt();
        int[][] sm = new int[r2][c2];
        int[][] am = new int[r1][c1];

        if(r1==r2 && c2==c1){
        System.out.println("Enter values of first matrix ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                fm[i][j] = sc.nextInt();
            }
        }

        System.out.println("first matrix: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {

                System.out.print(fm[i][j] + " ");
            }
            System.out.println();
        }

            System.out.println("Enter values of second matrix: ");
        for (p = 0; p < r2; p++) {
            for (k = 0; k < c2; k++) {
                sm[p][k] = sc.nextInt();
            }
        }

        System.out.println("second matrix: ");
        for (p = 0; p < r2; p++) {
            for (k = 0; k < c2; k++) {

                System.out.print(sm[p][k] + " ");
            }
            System.out.println();

        }
            for(int m =0; m<r1;m++){
                for(int n = 0; n<c1; n++){
                    am[m][n]=fm[m][n]+sm[m][n];
                }
            }
            System.out.println("Addition of two matrices");
            for(int m =0; m<r1;m++){
                for(int n = 0; n<c1; n++){
                    System.out.print(am[m][n]+" ");
                }
                System.out.println();
            }

        }
        else{
            System.out.print("Addition is not possible ");
        }

         
  }
}
