class Solution {
    	public int[] plusOne(int[] digits) {
		System.out.println(digits.length);
		int i=digits.length-1;
		int res[]=new int[i+2];
		while(i>=0) {
			if(digits[i]==9) {
				digits[i]=0;
				if(i==0) {
					res[i]=1;
					for(int j=0;j<digits.length;j++) {
						res[j+1]=digits[i];
					}
					return res;
				}
			}else {
				digits[i]+=1;
				break;
			}
			i--;
		}
		return digits;
	}
}
