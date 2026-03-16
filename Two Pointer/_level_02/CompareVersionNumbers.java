class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        System.out.println(Arrays.toString(v1)+"\n"+Arrays.toString(v2));
        int n=v1.length;
        int m=v2.length;
        int i=0,j=0;
        while(i<n && j<m){
            int n1=Integer.valueOf(v1[i]);

            int n2=Integer.valueOf(v2[j]);
            System.out.println(n1+" "+n2);
            if(n1>n2)return 1;
            else if(n1<n2)return -1;
            i++;
            j++;
        }
        while(i<n){
            if(Integer.valueOf(v1[i])>0)return 1;
            i++;
        }
        while(j<m){
            if(Integer.valueOf(v2[j])>0)return -1;
            j++;
        }
        return 0;
    }
}
