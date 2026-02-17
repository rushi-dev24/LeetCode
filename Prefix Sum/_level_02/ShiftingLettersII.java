class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int prefix[]=new int[s.length()];
        for(int i=0;i<shifts.length;i++){
            int l=shifts[i][0];
            int r=shifts[i][1];
            int dir=shifts[i][2];
            if(dir==0){
                prefix[l]=(prefix[l]-1);
                if(r<s.length()-1){
                    prefix[r+1]=(prefix[r+1]+1);
                }
            }
            else{
                prefix[l]=(prefix[l]+1);
                if(r<s.length()-1){
                    prefix[r+1]=(prefix[r+1]-1);
                }
            }
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=(sum+prefix[i])%26;
            prefix[i]=sum;
        }
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<s.length();i++){
            sb.append((char)(((prefix[i])+((int)s.charAt(i)-97)+26)%26+97));
        }
        return sb.toString();
    }
}
