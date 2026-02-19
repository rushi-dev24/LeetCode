class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];

        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }
        left[0]=nums[0];
        if(left[0]==right[0]) return 0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i];
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}
