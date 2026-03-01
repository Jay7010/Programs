class Solution {
    public int minPartitions(String n) {
        int h=n.length();
        int[] arr = new int[h];
        for(int i=0;i<n.length();i++){
            arr[i]=n.charAt(i)-'0';
        }
        Arrays.sort(arr);
        return arr[h-1];
    }
}