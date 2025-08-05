class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs= new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                while(hs.contains(s.charAt(i))){
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
            hs.add(s.charAt(i));
            max= Math.max(i-l+1,max);
        }
        return max;
        
    }
}