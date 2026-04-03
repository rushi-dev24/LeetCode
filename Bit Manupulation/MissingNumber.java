class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,res=0;
        for(int i=0;i<nums.length;i++){
            res^=i^nums[i];
        }
        return res^n;
    }
}
