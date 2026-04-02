class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length,res=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int num:nums){
                if((num & (1<<i))!=0)count++;
            }
            System.out.println(count);
            res|=((count%3)<<i);
        }
        return res;
    }
}
