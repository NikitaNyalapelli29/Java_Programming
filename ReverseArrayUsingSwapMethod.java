public class ReverseArrayUsingSwapMethod{
  public static void main(String[] args){
    int[] ele = {11,22,33,44,55,66,77,88,99};
        int temp;
        int n = Math.floorDiv(ele.length, 2);

        for(int i=0; i<n;i++){
            temp=ele[i];
            ele[i]=ele[ele.length-i-1];
            ele[ele.length-i-1]=temp;
        }
         for(int i=0;i< ele.length;i++) {
             System.out.print(ele[i]+" ");
         }
  }
}
