class Solution {
    public int maxSubArray(int[] nums) {

        int maxSub = nums[0];
        int currsum = 0;

        for(int num:nums){
            if(currsum < 0){
                currsum=0;
            }

            currsum += num;
            maxSub = Math.max(maxSub,currsum);
        }

        return maxSub;
        
    }
}
