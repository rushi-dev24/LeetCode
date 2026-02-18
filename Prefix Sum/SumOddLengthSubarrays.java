class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int res=0;

        //1st Subission
        /*
        *Using prefix sum
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        for(int i=0;i<prefix.length;i++){
            for(int j=i;j<prefix.length;j+=2){
                if(i==0){
                    res+=prefix[j];
                }else{
                    res+=(prefix[j]-prefix[i-1]);
                }
            }
        }
        */

        //2nd submission
        //Using math contribution technique
        int n=nums.length;
        for(int i=0;i<n;i++){
            int total=(i+1)*(n-i);
            int odds=(total+1)/2;
            res+=odds*nums[i];
        }
        return res;
    }
}
