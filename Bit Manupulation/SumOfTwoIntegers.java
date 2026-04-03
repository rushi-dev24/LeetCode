class Solution {
    public int getSum(int a, int b) {
        int xor=a^b;
        while(((a&b)<<1)!=0){
            int carry=(a&b)<<1;
            a=xor;
            b=carry;
            xor^=carry;
        }
        return xor;
    }
}
