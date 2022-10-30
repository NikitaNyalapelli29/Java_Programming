import java.util.scanner;
public class MinimumElementArrayFromUser{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Total number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    int min = Integer.MAX_VALUE;
    System.out.println("Enter elements:");
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    System.out.print("You entered elements are: ");
    for(int i:a){
      System.out.print(i +" ");
  }
    for(int i:a){
      if(i<min){
        min=i;
      }
    }
    System.out.print("\nMinimum value is :" +min);
  }
    
}

