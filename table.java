package basic;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value number here:");
        int num = sc.nextInt();
        for (int i=1; i<=10;i++){
            int ans = i*num;
            System.out.printf("%d * %d = %d \n",num,i,ans);

        }


    }
}
