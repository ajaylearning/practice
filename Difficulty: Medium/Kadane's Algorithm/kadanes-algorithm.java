class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum=0;
        int maxSum= arr[0];
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            maxSum= Math.max(maxSum, sum);
            if(sum<0)
            sum=0;
            
        }
        return maxSum;
    }
}
