class Solution {
    private int active=0,nonActive=1;
    public int scoreDifference(int[] nums) {
        int score[]=new int[2],n=nums.length;
        for(int i=0;i<n;i++){
            if((nums[i] & 1) == 1){
                swap();
            }
            if((i+1)%6 == 0){
                swap();
            }
            System.out.println(active+" "+nonActive);
            score[active]+=nums[i];
        }
        return score[0]-score[1];
    }
    public void swap(){
        int temp=active;
        active=nonActive;
        nonActive=temp;
    }
}©leetcode
