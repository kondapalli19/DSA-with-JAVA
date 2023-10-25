class StockSpanner {
    private final Stack<int[]> stack;

    public StockSpanner() {
        this.stack = new Stack<>();
    }
    
    public int next(int price) {
        int sum = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price)
            sum += stack.pop()[1];

        this.stack.push(new int[] { price, sum });

        return sum;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
