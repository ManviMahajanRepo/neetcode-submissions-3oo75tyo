class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int res = 0;
        Set<Character> hashset = new HashSet<>();

        for(int r=0; r<s.length(); r++){
            while(hashset.contains(s.charAt(r))){
                hashset.remove(s.charAt(l));
                l++;
            }
            hashset.add(s.charAt(r));
            res = Math.max(res,r-l+1);
            

        }

        return res;


        
    }
}
