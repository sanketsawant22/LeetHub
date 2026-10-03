class Solution {
    public int longestValidParentheses(String s) {

    //     int ans = 0;
        
    //     for(int i=0; i<s.length()-1; i++) {
    //         for(int j=i+1; j<s.length(); j++) {
    //             boolean isvalid = isValid(i, j, s);

    //             if(isvalid) {
    //                 ans = Math.max(ans, j-i+1);
    //             }
    //         }
    //     }

    //     return ans;
    // }    

    // public boolean isValid(int i, int j, String s) {
    //     int o = 0;
    //     int c = 0;

    //     for(int k=i; k<=j; k++) {

    //         if(c > o) return false;

    //         if(s.charAt(k) == '(') {
    //             o++;
    //         } else {
    //             c++;
    //         }
    //     }

    //     return o == c;
    // }

    Stack<Integer> st = new Stack<>();

    st.push(-1);

    int ans = 0;

    for(int i=0;i <s.length(); i++) {
        if(s.charAt(i) == '(') {
            st.push(i);
        } else {
            st.pop();

            if(st.isEmpty()) {
                st.push(i);
            } else {
                ans = Math.max(ans, i - st.peek());
            }
        }
    }

    return ans;


    }
}