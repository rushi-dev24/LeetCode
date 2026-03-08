class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        double leftSum=0,rightProduct=1;
        int res=-1;
        for(int i=0;i<n;i++)leftSum+=(double)nums[i];
        for(int i=n-1;i>=0;i--){
            leftSum-=(double)nums[i];
            if(leftSum==rightProduct)res=i;
            rightProduct*=(double)nums[i];
        }
        return res;
    }
}
