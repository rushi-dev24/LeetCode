class Solution {
    public int maxProduct(int[] nums) {
        //Using kadane's algorithm
        int n=nums.length,tempMax,tempMin,min=nums[0],max=nums[0],globalMax=nums[0];
        for(int i=1;i<n;i++){
            tempMax=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            tempMin=Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));
            max=tempMax;
            min=tempMin;
            globalMax=Math.max(globalMax,max);
        }
        return globalMax;
    }
}
