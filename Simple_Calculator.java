package basic;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value 1st here:");
      float num1 = sc.nextInt;
      
      System.out.println("Enter value 2nd here:");
      float num2 = sc.nextInt;
      
      int add = num1+num2;
      int sub = num1-num2;
      float mult = num1*num2;
      float div =  num1/num2;
      float mod = num1%num2;
      
      System.out.println("Addition of num1 and num2 is: " + add);
      System.out.println("Substraction of num1 and num2 is: " + sub);
      System.out.println("Multiplication of num1 and num2 is: " + mult);
      System.out.println("Division of num1 and num2 is: " + div);
      System.out.println("Remainder of num1 and num2 is: " + mod);
    }
}
