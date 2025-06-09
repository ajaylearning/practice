class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        int[] frequency1 = new int[27];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            frequency1[c-'a']++;
        }
        int[] frequency2 = new int[27];
        for(int i=0;i<n;i++){
            char c= t.charAt(i);
            frequency2[c-'a']++;
        }
        for(int i=0;i<27;i++){
            if(frequency1 [i]!=frequency2[i]){
                return false;
            }
        }
        return true;
    }
}