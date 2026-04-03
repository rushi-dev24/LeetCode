class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length(),xor=0;
        for(int i=0;i<n;i++){
            xor^=s.charAt(i)^t.charAt(i);
        }
        return (char)(xor^t.charAt(n));
    }
}
