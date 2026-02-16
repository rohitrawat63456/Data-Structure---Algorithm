class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int profit = 0;
        for(int i=prices.length-1;i>=0;i--){
            int currPrice = prices[i];
            if(st.isEmpty()){
                st.push(currPrice);
            }else{
                int peek = st.peek();
                if(peek > currPrice){
                    profit = Math.max(profit,peek-currPrice);
                }else{
                    st.push(currPrice);
                }
            }
        }
        return profit;
    }
}