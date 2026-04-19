class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackChar = new Stack<Character>();

        for(char c : s.toCharArray()){
            
            if(c == '(' || c== '{'|| c == '['){
                stackChar.push(c);
            }

            else {
                if (stackChar.isEmpty()) return false;

                 char top = stackChar.pop(); 
                if( c ==')' && top != '(' || c =='}' && top != '{' || c == ']' && top != '['){
                    return false;
                } 
            }
        }

        return stackChar.isEmpty();
    }
}
