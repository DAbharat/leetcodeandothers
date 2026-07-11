class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack2;
    public MinStack() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int value) {
        if(stack2.isEmpty() || value<=stack2.peek()) {
            stack2.push(value);
        }
        stack.push(value);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.pop().equals(stack2.peek())) {
            stack2.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */