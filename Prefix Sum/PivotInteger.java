class Solution {
    public int pivotInteger(int n) {
        int temp=n*(n+1);
        int x=temp/2;
        int res=(int)Math.sqrt(x);
        if(res*res==x) return res;
        return -1;
    }
}
