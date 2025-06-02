class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int count=1;
        int j=0;
        int i=0;
        while(i<k){
            if( j<n && arr[j]==count)
                j++;
            else{
                i++;
                
            }
            count++;

        }
        return count-1;
    }
}