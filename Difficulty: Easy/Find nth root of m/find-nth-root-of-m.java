// User function Template for Java

class Solution {
    public int nthRoot(int m, int n) {
        // code here
         int s = 1;
        int e = n;
        int mid = s+(e-s)/2;
        while(s<=e){
            // System.out.println(Math.pow(mid,m));
            if(Math.pow(mid,m)==n)
            return mid;
            else if(Math.pow(mid,m)<n){
                s=mid+1;
            }
            else
                e=mid-1;
                
            mid = s+(e-s)/2;
        }
        return -1;
    }
}