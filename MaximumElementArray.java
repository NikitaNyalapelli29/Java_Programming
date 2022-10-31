public class MaximumElementArray{
  public static void main(String[] args) {
        //for finding maximum element in the array
        int[] arr = {11,22,33,44,99,595,88,66,77};
        int max=Integer.MIN_VALUE;
        for (int i:arr) {
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum element from given array is " + max);
  }
    
}
