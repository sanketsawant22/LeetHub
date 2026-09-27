class Solution {
    public String reverseParentheses(String s) {

        int n = s.length();

        // matching[i] = index of matching parenthesis
        int[] matching = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);

            } else if (s.charAt(i) == ')') {

                int open = stack.pop();

                matching[open] = i;
                matching[i] = open;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int direction = 1;

        while (i >= 0 && i < n) {

            char c = s.charAt(i);

            if (c == '(' || c == ')') {

                i = matching[i];

                direction = -direction;

            } else {

                ans.append(c);
            }

            i += direction;
        }

        return ans.toString();
    }
}