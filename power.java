package loops;
import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1,num2,result=1;
        System.out.println("Enter num1 value here: ");
        num1 = sc.nextInt();

        System.out.println("Enter num2 value here: ");
        num2 = sc.nextInt();

        for(int i=1;i<=num2; i++)
        {
            result *= num1;
        }
        System.out.println("Answer:" + result);



    }
}
