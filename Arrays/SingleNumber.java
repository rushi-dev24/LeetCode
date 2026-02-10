import java.util.*;
import java.util.Map.*;

class Solution {
    public int singleNumber(int[] nums) {
        int res=nums[0];

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ele:nums){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        for(Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                res=entry.getKey();
                break;
            }
        }
        return res;
    }
}
