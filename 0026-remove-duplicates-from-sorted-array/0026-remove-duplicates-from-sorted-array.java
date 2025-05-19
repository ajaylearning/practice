class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> temp= new ArrayList<>();
        temp.add(nums[0]);
        for(int i =1;i<n;i++){
           if(nums[i-1]<nums[i]){
               temp.add(nums[i]);
           }
        }
        
        int k = temp.size();
        for(int i=0;i<k;i++){
            nums[i]= temp.get(i);
        }
        return k;
    }
}