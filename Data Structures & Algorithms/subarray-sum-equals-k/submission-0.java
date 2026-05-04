class Solution {
    public int subarraySum(int[] nums, int k) {

        int currsum =0, res = 0;

        Map<Integer,Integer> prevmap = new HashMap<>();
        prevmap.put(0, 1);

        for(int num:nums){
            currsum += num;
            int diff = currsum - k;
            res += prevmap.getOrDefault(diff,0);
            prevmap.put(currsum,prevmap.getOrDefault(currsum,0)+1);
        }

        return res;


        
    }
}