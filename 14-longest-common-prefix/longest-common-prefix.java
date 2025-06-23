class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        for(int i=0;i<strs[0].length();i++){
            boolean t=true;
            for(String j:strs){
                if(i>=j.length()){
                    t=false;
                    break;
                }
                if(strs[0].charAt(i)!=j.charAt(i)) t= false;
            }
            if(t){
                s=s+strs[0].charAt(i);
            }
            else{
                break;
        }
        }
        return s;
        
    }
}