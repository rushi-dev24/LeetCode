class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),i=0,j=n-1,currLen=0;
        String res="";
        while(i<n){
            String substr=s.substring(i,j+1);
            if(isParlindrome(substr)){
                if(j-i+1>currLen){
                    res=substr;
                    currLen=j-i+1;
                }
                i++;
                j=n;
            }
            j--;
            if(j==i-1){
                i++;
                j=n-1;
            }
        }
        return res;
    }
    public boolean isParlindrome(String s){
        boolean isPar=true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPar=false;
                break;
            }
            i++;
            j--;
        }
        return isPar;
    }
}
