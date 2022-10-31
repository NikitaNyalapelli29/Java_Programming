import java.util.*;
public class MaximumElementArrayFromUser{
  public class void main(String[] args){
        int max=Integer.MIN_VALUE;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i: arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("\nMaximum element is: " +max);

  }
}
