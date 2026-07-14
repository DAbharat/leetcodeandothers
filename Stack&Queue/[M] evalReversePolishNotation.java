class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int pop = 0;
        int val = 0;
        for (String token : tokens) {
            if(token.equals("+")) {
                pop = stack.pop();
                val=stack.pop()+pop;
                stack.push(val);
            } else if(token.equals("-")) {
                pop = stack.pop();
                val=stack.pop()-pop;
                stack.push(val);
            } else if(token.equals("*")) {
                pop = stack.pop();
                val=stack.pop()*pop;
                stack.push(val);
            } else if(token.equals("/")) {
                pop = stack.pop();
                val=stack.pop()/pop;
                stack.push(val);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}