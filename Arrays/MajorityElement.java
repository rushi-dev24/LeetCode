class Solution {
    public int majorityElement(int[] nums) {
    	int n=nums.length,minTimes=n/2,res=nums[0];
    	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
    	for(int i=0;i<n;i++) {
    		if(hm.containsKey(nums[i])) {
    			if(hm.get(nums[i])+1>minTimes) {
    				res= nums[i];
    				break;
    			}else{
                    hm.put(nums[i],hm.get(nums[i])+1);
                }
    		}else {
    			hm.put(nums[i],1);
    		}
    	}
        return res;
    }
}
