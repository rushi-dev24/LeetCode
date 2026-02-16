class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight=0,currHeight=0;        
        for(int i=0;i<gain.length;i++){
            currHeight+=gain[i];
            maxHeight=Math.max(maxHeight,currHeight);
        }
        return maxHeight;
    }
}
