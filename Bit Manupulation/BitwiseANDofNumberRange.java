class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int templ=left,tempr=right,count=0;
        while(templ!=tempr){
            count++;
            templ>>=1;
            tempr>>=1;
        }
        return templ<<count;
    }
}
