package basics;
public class ReverseArray{
  public static void main(String[] args){
    int[] arr = {23,56,43,12,78,54,66,98};
    for(int i=arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
    }
  }

}
