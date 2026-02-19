class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length(),sum=0;
        for(char ch:s.toCharArray()){
            sum+=ch-'a'+1;
        }
        if((sum & 1) == 1) return false;
        int running=0;
        for(int i=0;i<n;i++){
            running+=s.charAt(i)-'a'+1;
            if(running == sum/2) return true;
        }
        return false;
    }
}
