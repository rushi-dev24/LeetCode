class Solution {
    public int maximumPopulation(int[][] logs) {
        int minYear=2050,maxPop=0;
        for(int i=1950;i<=2050;i++){
            int pop=0;
            for(int j=0;j<logs.length;j++){
                if(logs[j][0]<=i && logs[j][1]>i){
                    pop++;
                }
                if(pop>maxPop){
                    maxPop=pop;
                    minYear=i;
                }
            }
        }
        return minYear;
    }
}
