class Solution {
    int minRow(int mat[][]) {
        // code here
        int n =mat.length;
        int m= mat[n-1].length;
        int minCount=0;
        int minRow=1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==0)
                count++;
            }
            if(count>minCount){
                minCount = count;
                minRow=i+1;
            }
            
        }
        return minRow;
    }
};