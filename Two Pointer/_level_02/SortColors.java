import java.util.Map.*;

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min=nums[i],minIndex=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<min){
                    min=nums[j];
                    minIndex=j;
                }
            }
            int temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
    }   
}

//=>Time Complexity = O(n^2) & Time Complexity = O(1)
