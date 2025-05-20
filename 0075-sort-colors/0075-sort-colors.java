class Solution {
    public void sortColors(int[] nums) {
        int[] hash = new int[3];
        int n = nums.length;
        for(int i =0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[0]>0){
                nums[i]=0;
                hash[0]--;
            }
            else if(hash[1]>0){
                nums[i]=1;
                hash[1]--;
            }
            else if(hash[2]>0){
                nums[i]=2;
                hash[2]--;
            }
        }
    }
}