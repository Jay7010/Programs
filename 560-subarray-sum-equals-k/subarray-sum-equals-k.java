class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        int[] n = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum= sum+nums[i];
            n[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sun;
                if(i==0){
                    sun=n[j];
                }
                else{
                    sun= n[j]-n[i-1];
                }
                if(sun==k){
                    count++;
                }
            }
        }
        return count;
        
    }
}