class Solution {

    public static boolean isOperation(String ch) {
    return ch.equals("+") ||
           ch.equals("-") ||
           ch.equals("*") ||
           ch.equals("/");
}

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String ch: tokens) {
            if(!isOperation(ch)) {
                stack.push(Integer.parseInt(ch));
            } 
            else {
                int a = stack.pop();
                int b = stack.pop();

                int ans = 0;

                if(ch.equals("+")) ans = b + a;
                if(ch.equals("-")) ans = b - a;
                if(ch.equals("*")) ans = b * a;
                if(ch.equals("/")) ans = b / a;

                stack.push(ans);
            }
        }

        return stack.pop();
    }
}