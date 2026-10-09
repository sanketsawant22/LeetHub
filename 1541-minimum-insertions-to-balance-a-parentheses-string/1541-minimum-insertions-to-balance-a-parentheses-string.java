class Solution {
    public int minInsertions(String s) {
        int op = 0;
        int cl = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                cl += 2;

                if(cl % 2 == 1) {
                    op++;
                    cl--;
                }
            }

            else {
                cl--;

                if(cl < 0) {
                    op++;
                    cl = 1;
                }
            }

        }

        return op + cl;
    }
}