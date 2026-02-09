class Solution {
    	public int[] plusOne(int[] digits) {
		int i=digits.length-1;
		int res[]=new int[i+2];
		while(i>=0) {
			if(digits[i]==9) {
				digits[i]=0;
			}else {
				digits[i]+=1;
				break;
			}
            if(i==0) {
					res[i]=1;
					for(int j=0;j<digits.length;j++) {
						res[j+1]=digits[i];
					}
					return res;
				}
			i--;
		}
		return digits;
	}
}
