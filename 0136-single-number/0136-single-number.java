import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor = xor^ nums[i];
        }
        return xor;

        // int max=nums[0];
        // for(int i =0;i<n;i++){
        //     max= Math.max(max, nums[i]);
        // }
        // int[] hash= new int[max+1];
        // for(int i =0;i<n;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<n;i++){
        //     if(hash[nums[i]]==1)
        //     return nums[i];
        // }
        // return -1;
    }
}