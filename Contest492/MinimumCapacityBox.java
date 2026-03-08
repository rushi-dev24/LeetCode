class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length,index=-1;
        for(int i=0;i<n;i++){
            if(capacity[i]-itemSize>=0){
                if(index!=-1 && capacity[i]<capacity[index]) index=i;
                else if(index==-1) index=i;
            }
        }
        return index;
    }
}©leetcode
