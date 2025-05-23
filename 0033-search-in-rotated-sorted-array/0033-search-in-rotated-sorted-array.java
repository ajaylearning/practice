class Solution {
    public int findPivot(int[] nums, int s, int e){
        
        int mid= s+(e-s)/2;
        while(s<e){
            if(nums[0]<=nums[mid])
            s=mid+1;
            else
            e = mid;

            mid= s+(e-s)/2;
        }
        return s;
    
    }

    public int binarySearch(int[] nums, int target, int s , int e){
        int mid= s+(e-s)/2;
        while(s<=e){
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            s = mid +1;
            else
            e = mid-1;
            mid= s+(e-s)/2;
        }
        return -1;

    }

    public int search(int[] nums, int target) {
        int n= nums.length;
        int s=0;
        int e=n-1;
        int pivot= findPivot(nums,s,e);
        if(nums[pivot]<= target && nums[n-1]>=target)
            return binarySearch(nums,target,pivot,e);
        else
            return binarySearch(nums, target,s,pivot);
    }
}