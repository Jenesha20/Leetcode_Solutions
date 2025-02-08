class MinStack {
   Stack<Integer> s;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        if(!s.isEmpty())
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int m=Integer.MAX_VALUE;
        Iterator<Integer> i=s.iterator();

            while(i.hasNext())
            {
                m=Math.min(m,i.next());
            }
        
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */