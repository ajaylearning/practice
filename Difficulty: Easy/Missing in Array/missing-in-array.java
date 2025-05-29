class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        // int sum = (n+2)*(n+1)/2;
        // int sumArr =0;
        // for (int i=0;i<n;i++){
        //     sumArr= sumArr +arr[i];
        // }
        
        // return sum-sumArr;
        int[] hash = new int[n+2];
        for (int i =0; i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<n+2;i++){
            if(hash[i]==0)
            return i;
        }
        return -1;
    }
}