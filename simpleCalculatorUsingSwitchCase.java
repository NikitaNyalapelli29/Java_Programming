package loops;
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // System.out.print("Enter your age : ");
        float num1, num2;
        System.out.print("Enter num1 value here: ");
        num1= input.nextInt();

        System.out.print("Enter num2 value here: ");
        num2= input.nextInt();

        float sum,sub;
        double multi;
        float div;

        //int choose;

         System.out.println("choice : \n 1. '+' \n 2. '-' \n 3. '*' \n 4. '/'");

       int choose = input.nextInt();

        sum=num1+num2;
        sub = num2-num1;
        multi= num1*num2;
        div = num2/num1;

        switch (choose){
            case 1:
                System.out.print(sum);
                break;

            case 2:
                System.out.println(sub);
                break;

            case 3:
                System.out.print(multi);
                break;

            case 4:
                System.out.println(div);
                break;
            default :
                System.out.println("You entered invalid");




        }






    }
}
