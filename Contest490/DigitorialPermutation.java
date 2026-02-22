import java.util.Map.*;

class Solution {
    public boolean isDigitorialPermutation(int n) {
        long x=n,sum=0;
        LinkedHashMap<Long,Long> hmap=new LinkedHashMap<>();
        while(n>0){
            long rem=n%10;
            hmap.put(rem,hmap.getOrDefault(rem,0L)+1);
            if(rem==0 || rem == 1) {
                sum+=1;
                n/=10;
                continue;
            }
            long temp=1;
            for(long i=2;i<=rem;i++){
                temp*=i;
            }
            sum+=temp;
            n/=10;
        }
        boolean isValid=true;
        while(sum>0){
            long rem=sum%10;
            if(!hmap.containsKey(rem)){
                return false;
            }
            hmap.put(rem,hmap.get(rem)-1);
            sum/=10;
        }
        for(Entry<Long,Long> entry:hmap.entrySet()){
            if(entry.getValue()>0) isValid=false;
        }
        return isValid;
    }
}©leetcode
