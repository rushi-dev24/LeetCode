class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,pivot=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        for(int i=n-1;i>pivot && pivot!=-1;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        if(pivot==-1){
            int left=0,right=n-1;
            while(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
                left++;
            }
        }else{
            int left=pivot+1,right=n-1;
            while(left<=right ){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
                left++;
            }
        }
    }
}
