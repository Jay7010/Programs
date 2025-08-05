class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb =new StringBuilder();
        int max=0;
        int l=0;
        if(s.length()<=1){
            return s.length();
        }
        for(int i=0;i<s.length();i++){
           if(sb.toString().contains(s.charAt(i)+"")){
                
                while(sb.toString().contains(s.charAt(i)+"")){
                    sb.deleteCharAt(0);
                   
                }
                sb.append(s.charAt(i));
                System.out.println(sb);
           }
           else{
            sb.append(s.charAt(i));
           }
           max= Math.max(sb.length(),max);
            
        }
        return max;
        
    }
}