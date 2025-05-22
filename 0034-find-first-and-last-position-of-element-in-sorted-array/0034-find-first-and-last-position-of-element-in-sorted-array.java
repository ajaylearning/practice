class Solution {
    public int firstNum(int[] nums, int target){
        int n=nums.length;
        int start =0;
        int end=n-1;
        int ans=-1;
        int mid = start +(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                ans= mid;
                end= mid-1;
            }
            else if (nums[mid]<target)
            start = mid+1;
            else 
            end= mid-1;

            mid = start +(end-start)/2;
        }
        return ans;
    }

    public int lastNum(int[] nums, int target){
        int n=nums.length;
        int start =0;
        int end=n-1;
        int ans=-1;
        int mid = start +(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                ans= mid;
                start= mid+1;
            }
            else if (nums[mid]<target)
            start = mid+1;
            else 
            end= mid-1;

            mid = start +(end-start)/2;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
           int firstNum = firstNum(nums, target);
           int lastNum = lastNum(nums, target);
           int [] range = {firstNum, lastNum};
           return range;
    }
}