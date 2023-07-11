public class BubbleSort{
  public static void main(String[] args){
    int arr[] = {4,9,1,6,11,3,7};
    int swapped=0;
    for(int i= 0; i<arr.length-1; i++){ // outer loop
      for(int j = 0; j<arr.length-1-i; j++){  // inner loop
        if(arr[j]>arr[j+1]){
          swapped++;    // how many times swap done calculating
          // swapping
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      }
    // printing array
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
