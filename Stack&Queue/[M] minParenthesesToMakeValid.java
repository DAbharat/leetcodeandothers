class Solution {
    public int minAddToMakeValid(String s) {
        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : charArr) {
            if(ch=='(') { 
                stack.push(ch);
            } else if(ch==')' && (stack.isEmpty() || stack.peek()!='(')) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }
        return stack.size();
    }
}