class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length,xor=0,a=0,b=0;
        for(int num:nums)xor^=num;
        int temp=xor;
        xor=temp^(xor & (xor-1));
        for(int num:nums){
            if((num & xor)!=0)a^=num;
            else b^=num;
        }
        return new int[]{a,b};
    }
}
