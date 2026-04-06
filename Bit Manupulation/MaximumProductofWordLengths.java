class Solution {
    public int maxProduct(String[] words) {
        int n=words.length,res=0;
        int[] mask=new int[n];
        int[] lens=new int[n];
        for(int i=0;i<n;i++){
            for(char ch:words[i].toCharArray()){
                mask[i]|=1<<(ch-'a');
            }
            lens[i]=words[i].length();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((mask[i] & mask[j])==0)res=Math.max(res,lens[i]*lens[j]);
            }
        }
        return res;
    }
}
