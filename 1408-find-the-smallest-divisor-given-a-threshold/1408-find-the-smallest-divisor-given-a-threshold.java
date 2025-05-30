class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s= 1;
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int e= max;
        int mid = (s+e)/2;
        int ans=-1;
        while(s<=e){
            int sum=0;
            for(int i=0;i<n;i++){
                sum +=  Math.ceil((double)nums[i]/(double)mid);
            }
            if(sum<= threshold){
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;

            mid=(s+e)/2;
        }
        return ans;
    }
}