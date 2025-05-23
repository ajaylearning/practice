class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        int s=0;
        int e=n-1;
        int mid= s+(e-s)/2;
        if(nums[0]<nums[n-1])
        return nums[0];
        while(s<e){
            if(nums[0]<=nums[mid])
            s=mid+1;
            else
            e = mid;

            mid= s+(e-s)/2;
        }
        return nums[mid];
    }
}