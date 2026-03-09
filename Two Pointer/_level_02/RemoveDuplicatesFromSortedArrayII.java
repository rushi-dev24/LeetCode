class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,count=1,freq=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
                freq=1;
            }
            if(freq>2){
                int temp=nums[i];
                while(nums[i]!=temp)i++;
            }else{
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
