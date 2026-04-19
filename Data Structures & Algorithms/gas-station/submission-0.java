class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum())
        {
            return -1;
        }

        int curr = 0;
        int res = 0;
        for(int i=0; i<gas.length; i++){
            curr += (gas[i] - cost[i]);
            if(curr < 0){
                curr = 0;
                res = i+1;
            }
        }

        return res;
            
        
        
    }
}
