class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();

        for(char c: s.toCharArray()){
            smap.put(c,smap.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }

        return smap.equals(tmap);  

    }
}

/*
logic: anagrams = frequency of characters will be same
hashmap can store the frequency with key as literal and value as count.
if both hashmaps are equal then return true else return false

*/
