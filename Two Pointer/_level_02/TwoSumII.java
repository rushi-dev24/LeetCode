class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length,index1=0,index2=1;
        while(index2<n){
            int comp=target-numbers[index2];
            index1=bs(numbers,0,index2-1,comp);
            if(index1!=-1)return new int[]{index1+1,index2+1};
            index2++;
        }
        return new int[]{-1,-1};
    }
    public int bs(int[] arr,int s,int e,int key){
        int mid;
        while(s<=e){
            mid=(s+e)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]<key) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}
