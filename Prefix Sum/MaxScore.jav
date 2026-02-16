class Solution {
    public int maxScore(String s) {
        int countZeroes=0;
        int[] prefixZeroes=new int[s.length()-1];
        char[] str=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            if(str[i]=='0'){
                countZeroes++;
            }
            prefixZeroes[i]=countZeroes;
        }
        if(str[s.length()-1]=='0') countZeroes++;
        int countOnes=s.length()-countZeroes;
        int[] prefixOnes=new int[s.length()-1];
        for(int i=0;i<s.length()-1;i++){
            if(str[i]=='1'){
                countOnes--;
            }
            prefixOnes[i]=countOnes;
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            max=Math.max(max,prefixZeroes[i]+prefixOnes[i]);
        }
        return max;
    }
}
