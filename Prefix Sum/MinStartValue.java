class Solution {
    public int minStartValue(int[] nums) {
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=Math.min(min,sum);
        }
        if(min<=0)return -min+1;
        return 1;
    }
}
