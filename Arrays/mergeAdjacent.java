class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> res=new ArrayList<>();
        for(int ele:nums){
            res.add((long)ele);
        }
        long i=0,j=1,temp=0,fir,sec;
        while(i<(long)res.size()-1 && j<(long)res.size()){
            fir=res.get((int)i);
            sec=res.get((int)j);
            temp=fir+sec;
            if(fir==sec){
                // System.out.println(temp+" "+(int)i+" "+res);
                res.set((int)i,temp);
                // System.out.println((int)j+" "+res);
                res.remove((int)j);
                // System.out.println(res);
                if((int)i-1>=0){
                    i--;
                    j--;
                }
            }else{
                i++;
                j++;
            }
        }
        return res;
    }
}
