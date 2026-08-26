class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ')' && !stack.isEmpty()){
                int peek = stack.peek();
                if(peek == '('){stack.pop();}
                else{return false;}
            }
            else if(s.charAt(i) == '}'  && !stack.isEmpty()){
                int peek = stack.peek();
                if(peek == '{'){stack.pop();}
                else{return false;}
            }
            else if(s.charAt(i) == ']'  && !stack.isEmpty()){
                int peek = stack.peek();
                if(peek == '['){stack.pop();}
                else{return false;}

            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.size() == 0;
    }
}
