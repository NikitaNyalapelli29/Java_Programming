

class Solution{
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSum = Long.MIN_VALUE;
        long currSum =0;
        
        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
            
        }
        return maxSum;
    }
    
}
