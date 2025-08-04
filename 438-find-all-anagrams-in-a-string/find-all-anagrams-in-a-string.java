class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] s1= p.toCharArray();
        Arrays.sort(s1);
        String s11= new String(s1);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< s.length()-p.length()+1;i++){
            if(p.contains(s.charAt(i)+"")){
                String d= s.substring(i,i+p.length());
                char[] s2= d.toCharArray();
                Arrays.sort(s2);
                String s12= new String(s2);
                if(s12.equals(s11)){
                    arr.add(i);
                }
            }
        }
        return arr;
        
    }
}