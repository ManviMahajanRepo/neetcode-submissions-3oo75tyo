class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hashmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(hashmap.containsKey(comp)){
                return new int[] {hashmap.get(comp),i};
            }
            hashmap.put(nums[i],i);
        }

        return new int[] {};
        
    }
}
