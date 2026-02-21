class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //Using kadane's algorithm

        int n=nums.length,global=Integer.MIN_VALUE,runningMax=0,runningMin=0,temp;
        for(int i=0;i<n;i++){
            runningMax=Math.max(nums[i],runningMax+nums[i]);
            runningMin=Math.min(nums[i],runningMin+nums[i]);
            temp=Math.max(Math.abs(runningMax),Math.abs(runningMin));
            global=Math.max(global,temp);
        }
        return global;
    }
}
