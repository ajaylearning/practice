class Solution {
    public String reverseWords(String s) {
        String[] sw = s.trim().split("\\s+");
        int n = sw.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            String temp= sw[start];
            sw[start]=sw[end];
            sw[end]=temp;
            start++;
            end--;
        }
       return  String.join(" ",sw);
    }
}