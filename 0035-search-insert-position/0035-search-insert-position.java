class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int start=0;
        int end = n-1;
        int mid= (start+end)/2;
        while(start<=end){
            if(nums[mid]==target)
            return mid;
            if(nums[mid]>target)
            end= mid-1;
            else
            start= mid+1;
            mid=(start+end)/2;
        }
        if(target<nums[0])
        return 0;
        else
        return mid+1;
    }
}