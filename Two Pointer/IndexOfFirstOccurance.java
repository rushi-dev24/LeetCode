class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length(),index=-1;
        for(int i=0;i<n-m+1;i++){
            if(haystack.substring(i,m+i).equals(needle)){
                index=i;
                break;
            }
        }
        return index;
    }
}
