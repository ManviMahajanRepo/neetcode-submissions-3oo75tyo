class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> hashmap1 = new HashMap<>();
        Map<Character,Integer> hashmap2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            hashmap1.put(s.charAt(i),hashmap1.getOrDefault(s.charAt(i),0)+1);
            hashmap2.put(t.charAt(i),hashmap2.getOrDefault(t.charAt(i),0)+1);
        }

        return hashmap1.equals(hashmap2);

        

    }
}
