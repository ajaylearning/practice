import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> c:mp.entrySet()){
            if(c.getValue()>(n/2))
            return c.getKey();
        }
        return -1;
    }
}