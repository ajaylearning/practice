class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n =  s.length();
        Map<Character, Character > iso = new HashMap<>();
        Map<Character, Character > isoT = new HashMap<>();
        for(int i =0; i<n;i++){
            if(iso.containsKey(s.charAt(i)) && iso.get(s.charAt(i))!= t.charAt(i)){
                return false;
            }else{
                iso.put(s.charAt(i),t.charAt(i));
            }
             if(isoT.containsKey(t.charAt(i)) && isoT.get(t.charAt(i))!= s.charAt(i)){
                return false;
            }else{
                isoT.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}