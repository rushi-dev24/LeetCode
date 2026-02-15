import java.util.*;
import java.util.Map.*;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        if(bulbs.size()==1)return bulbs;
        List<Integer> res=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int ele:bulbs){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        for(Entry<Integer,Integer> entry:map.entrySet()){
            if((entry.getValue() & 1)==1){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
