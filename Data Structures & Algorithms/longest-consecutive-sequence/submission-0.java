class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int num:nums){
            hashset.add(num);
        }

        int longest = 0;
        for(int num:hashset){

            if(!hashset.contains(num-1)){
                int length = 1;
                while(hashset.contains(num+length)){
                    length++;
                }

                longest = Math.max(longest,length);
            }
        }

        return longest;
        
    }
}
//aproach: convert to hashset for o(1) lookups.
//if num-1 does not exist in hashset, increment length;
//now check for num+1, num+2...until num+length to see if there is a sequence
//increment length with it
//max length