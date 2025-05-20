class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int count=0;
        int maxCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0 && maxCount<count){
                maxCount=count;
                count=0;
            }
            else if(nums[i]==0)
                count=0;
            else
                count++;
        }
        if(maxCount<count){
            maxCount = count;
        }

        return maxCount;
    }
}