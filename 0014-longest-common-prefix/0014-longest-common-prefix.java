class Solution {
    public String longestCommonPrefix(String[] strs) {
        String cmn="";
        int n= strs.length;
        int maxLen = strs[0].length();
        for(int i=0;i<maxLen;i++){
            for(int j=0;j<n-1;j++){
                
                if( strs[j+1].length()<=i ||strs[j].charAt(i)!=strs[j+1].charAt(i) )
                    return cmn;
                
            }
            cmn= cmn+strs[0].charAt(i);
        }
        return cmn;
    }
}