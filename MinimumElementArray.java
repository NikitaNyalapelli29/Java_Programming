public class MinimumElementArray{
  public static void main(String[] args){
    int[] arr = {23,67,12,98,34,28,77,56,89,86};
    int min = Integer.MAX_VALUE;
    for(int i : arr){
      if(i<min){
        min = i;
      }
    }
    System.out.println("Minimum value is " +min);
  }
}
