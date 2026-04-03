class Solution {
    public boolean isPowerOfFour(int n) {
        boolean oneSetBit = (n>0) && (n & (n-1))==0;
        if(!oneSetBit)return false;
        for(int i=0;i<32;i+=2){
            if((n & (1<<i))!=0)return true;
        }
        return false;
    }
}
