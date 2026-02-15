import java.util.*;
import java.util.Map.*;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        if(nums.length==1)return nums[0];
        Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        Map<Integer,Integer> res=new LinkedHashMap<Integer,Integer>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        for(Entry<Integer,Integer> entry:map.entrySet()){
            if(res.containsKey(entry.getValue())){
                res.put(entry.getValue(),res.get(entry.getValue())+1);
            }else{
                res.put(entry.getValue(),1);
            }
        }
        // System.out.println(map+" "+res);
        int key=0;
        for(Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()==1){
                key=entry.getKey();
                break;
            }
        }for(Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==key){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        System.out.println(-1);
        return -1;
    }
}©leetcode
