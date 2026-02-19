class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length,sum=0;
        for(int num:nums) sum+=num;

        int running=0,count=0;
        for(int i=0;i<n-1;i++){
            running+=nums[i];
            if((Math.abs(sum-2*running) & 1) == 0) count++;
        }
        return count;
    }
}
