class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
        boolean negative=((dividend<0) ^ (divisor<0));
        long d=Math.abs((long)dividend);
        long di=Math.abs((long)divisor);
        int res=0;
        while(d>=di){
            int pow=0;
            while(d>=(di<<pow+1)){
                pow++;
            }
            d-=(di<<pow);
            res+=(1<<pow);
        }
        return negative?-res:res;
    }
}
