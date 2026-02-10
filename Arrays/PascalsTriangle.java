class Solution {
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
    	int ans=1;
    	List<Integer> temp=new ArrayList<Integer>();
    	temp.add(ans);
    	res.add(temp);
    	for(int i=1;i<numRows;i++) {
    		temp=new ArrayList<Integer>();
    		ans=1;
    		temp.add(ans);
    		for(int j=1;j<=i;j++) {
    			ans=ans*(i+1-j);
    			ans=ans/j;
    			temp.add(ans);
    		}
    		res.add(temp);
    	}
        return res;
    }
}
