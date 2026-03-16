class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        String res=sb.toString().trim();
        return res;
    }
}
