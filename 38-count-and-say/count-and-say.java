class Solution {
    String count(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            int c = 1;
            
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                c++;
                i++;
            }
            res = res + c + s.charAt(i);
        }
        return res;
    }

    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String res = "1";
        for(int i = 2; i <= n; i++){
            res = count(res);
        }
        return res;
    }
}
