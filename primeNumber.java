package basic;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whether prime or not: ");
        int num = sc.nextInt();
        boolean flag=false;
        for(int i=2; i<num;i++){
            if(num%i==0){
                flag=true;
                break;
            }
            else {
                flag=false;
            }

        }
        if(flag==true){
            System.out.println("this is not a prime number");
        }
        else{
            System.out.println("this is a prime number");
        }
    }
}
