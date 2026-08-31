class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch , freq.getOrDefault(ch,0)+1);
        }for(char ch:t.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)-1);
        }
        for(int count : freq.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}