class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<(1<<n);i++){
            boolean isValid=true;
            List<Integer> subset=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    if(j>0 && nums[j]==nums[j-1] && (i & (1<<(j-1)))==0){
                        isValid=false;
                        break;
                    }
                    subset.add(nums[j]);
                }
            }
            if(isValid)res.add(subset);
        }
        return res;
    }
}
