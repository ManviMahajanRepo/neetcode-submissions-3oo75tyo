class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(char c:s.toCharArray()){

            if(map.containsKey(c)){
                stack.push(c);
                continue;
            } else {
                if(stack.empty()){
                    return false;
                }
            }

            char prev_char = stack.pop();
            if(map.get(prev_char) != c){
                return false;
            }

        }

        return stack.empty();
        
    }
}