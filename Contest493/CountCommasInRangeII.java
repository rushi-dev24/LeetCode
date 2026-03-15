class Solution {
    public long countCommas(long n) {
        String str=String.valueOf(n);
        int maxCommas=(str.length()-1)/3;
        long res=0;
        for(int i=maxCommas;i>0;i--){
            long tempNum=(long)Math.pow(10,i*3);
            res+=Math.max((n-tempNum+1)*i,0);
            n=tempNum-1;
        }
        return res;
    }
}©leetcode
