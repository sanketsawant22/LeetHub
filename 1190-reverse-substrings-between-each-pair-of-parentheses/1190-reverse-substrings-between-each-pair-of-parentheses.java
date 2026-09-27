class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        while(sb.lastIndexOf("(") != -1) {
            int a = sb.lastIndexOf("(");
            int b = sb.indexOf(")", a);

            StringBuilder temp = new StringBuilder(sb.substring(a+1, b));

            temp.reverse();

            sb.replace(a, b+1, temp.toString());
        }

        return sb.toString();

    }
}