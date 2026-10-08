class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 0;

        int flag = -1;

        for(char ch: s.toCharArray()) {
            if(flag == -1 && ch == '(') {
                flag = 1;
                continue;
            }

            if(flag == 1) {
                if(ch == '(') {
                    sb.append(ch);
                    count++;
                    continue;
                }
                else if(ch == ')' && count > 0) {
                    sb.append(ch);
                    count--;
                    continue;
                }
                else if (ch == ')' && count <= 0) {
                    flag = -1;
                    continue;
                }
            }
        }

        return sb.toString();
    }
}