class Solution {
    public int maxDepth(String s) {
        
        int ans = 0;
        int count = 0;

        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                ans++;
                if (ans > count) count = ans;
            }
            else if(ch == ')') {
                ans--;
            }
        }

        return count;

    }
}