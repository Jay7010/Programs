class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        perm(l,nums,res);
        return res;       
    }
    void perm( ArrayList<Integer> l, int[] nums, List<List<Integer>> res ){
        if(l.size()==nums.length){
            res.add(new ArrayList(l));
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            perm(l,nums,res);
            l.remove(l.size()-1);
        }
    }
}