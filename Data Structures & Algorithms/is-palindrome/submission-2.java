class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for(Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        String clean = sb.toString();
        int l=0; int r = clean.length()-1;

        while(l < r){
            if(clean.charAt(l) != clean.charAt(r)) return false;
            l++; r--;
                
            
        }

        return true;
        
    }
}
