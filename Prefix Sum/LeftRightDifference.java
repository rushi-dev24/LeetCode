/*
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(ans));
        ans[n-1]=Math.abs(nums[n-1]-ans[n-1]);
        int temp=nums[n-1];
        for(int i=n-2;i>=0;i--){
            // System.out.println(ans[i]+" "+nums[i]+" "+temp);
            ans[i]=Math.abs(ans[i]-nums[i]-temp);
            temp+=nums[i];
        }
        return ans;
    }
}
*/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[nums.length];
        int sum=0;
        for(int num:nums) sum+=num;
        int running=0;
        for(int i=n-1;i>=0;i--){
            running+=nums[i];
            ans[i]=Math.abs(sum-running);
            sum-=nums[i];
        }
        return ans;
    }
}
