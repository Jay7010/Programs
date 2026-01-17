class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0;
        int count =0;
        Arrays.sort(s);
        Arrays.sort(g);
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
            }
            else if(s[j]<g[i]){
                j++;
                continue;
            }
            i++;
            j++;

        }
        return count;
        
    }
}