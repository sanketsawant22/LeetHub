class Solution {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(char ch: s.toCharArray()) {
            
            if(ch == '(') {
                st.push(0);
            }
            else {
                int prev = st.pop();
                
                int ans = prev == 0 ? 1 : prev * 2;

                st.push(st.pop() + ans);

            }

        }

        return st.pop();

    }
}