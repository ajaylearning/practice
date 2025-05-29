/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int s = 1;
        int e = n;
        int mid = s+(e-s)/2;
        int ans=1;
        while(s<e){
            if(mid*mid<=n){
                s=mid+1;
                ans=mid;
            }
            else
                e=mid;
                
            mid = s+(e-s)/2;
        }
        return ans;
    }
}