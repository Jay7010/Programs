class Solution {
    public String removeKdigits(String num, int k) {
// this is done using monotonic stack where to get the smallest number the order of the digits from left to right should be in increasing order 
        Stack<Character> stack = new Stack<>();
        if(num.length()<=k){
            return "0";
        }
        for(char ch : num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.add(ch);
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb=sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();

    }
}