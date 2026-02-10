class Solution {
    public static List<Integer> getRow(int rowIndex) {
		List<Integer> res=new ArrayList<Integer>();
		long ans=1;
		res.add((int)ans);
		for(int i=1;i<=rowIndex;i++) {
			ans=ans*(rowIndex-i+1);
			ans=ans/i;
			res.add((int)ans);
		}
        return res;
    }
}
