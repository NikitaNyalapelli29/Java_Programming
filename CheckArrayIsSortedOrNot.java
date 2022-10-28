public class CheckArrayIsSortedOrNot{
  public static void main(String[] args){
    int[] arr = {23,65,88,63,13};
        boolean ans = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ans=false;
                break;
            }

        }
        if(ans==true) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
  }
}
