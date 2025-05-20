import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int[] loc= new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i])){
                loc[0]=mp.get(target-nums[i]);
                loc[1]=i;
                return loc;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return loc;
    }
}