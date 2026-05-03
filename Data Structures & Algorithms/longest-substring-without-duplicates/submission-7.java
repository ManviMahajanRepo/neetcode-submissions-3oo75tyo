class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int l = 0;
        int max_len = 0;

        for(int r=0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max_len = Math.max(max_len,r-l+1);
        }

        return max_len;
        
    }
}
