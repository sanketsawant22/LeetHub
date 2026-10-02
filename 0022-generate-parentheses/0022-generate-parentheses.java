class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        
        backtrack("", 0, 0, n);

        return ans;
    }
    
    public void backtrack(String curr, int open, int close, int n) {
        
        if(close > open) return;

        if(open > n) {
            return;
        }

        if(open == close && open == n) {
            ans.add(curr);
            return;
        }

        backtrack(curr + "(", open + 1, close, n);
        backtrack(curr + ")", open, close + 1, n);
    }

}