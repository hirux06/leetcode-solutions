import java.util.Stack;

class MinStack {

    private long min;
    private Stack<Long> st;

    public MinStack() {
        this.st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(0L); // 0 represents no diff (val - min)
            min = val;
        } else {
            long diff = (long)val - min;
            st.push(diff);
            if (val < min) {
                min = val;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        long diff = st.pop();
        if (diff < 0) {
            min = min - diff; // Recover previous min
        }
    }

    public int top() {
        long diff = st.peek();
        if (diff >= 0) {
            return (int)(min + diff);
        } else {
            return (int)min;
        }
    }

    public int getMin() {
        return (int)min;
    }
}
