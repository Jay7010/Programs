class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key)>c){
                c= map.get(key);
                max= key;
            }
        }
        return max;
        
    }
}