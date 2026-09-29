class Solution {
    public String longestPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        int start = -1;
        int end = -1;
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);

            for(int j=s.length() - 1; j>=i; j--) {
                if(s.charAt(j) == a) {
                    if(isPalindrom(s, i, j)) {
                        if(max < j-i+1) {
                            max = j-i+1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }

        for(int k=start; k<=end; k++) {
                sb.append(s.charAt(k));
            }

        return sb.toString();

    }

    public boolean isPalindrom(String s, int i, int j) {
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}