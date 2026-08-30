class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st = new HashMap<>();
        HashMap<Character,Character> ts = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(st.containsKey(sc) && st.get(sc) != tc){
                return false;
            }
            if(ts.containsKey(tc) && ts.get(tc) != sc){
                return false;
            }
            st.put(sc,tc);
            ts.put(tc,sc);
        }
        return true;
    }
}