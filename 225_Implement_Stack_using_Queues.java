public class MyStack {
    
    Queue<Integer> mq;
    /** Initialize your data structure here. */
    public MyStack() {
        mq = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        mq.add(x);
        for (int i = 1; i < mq.size(); i++){
            mq.add(mq.remove());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return mq.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return mq.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */