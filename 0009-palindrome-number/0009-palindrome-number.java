class Solution {
    public boolean isPalindrome(int x) {
        int pal = 0;
        int org = x;

        while(x > 0) {
            int l = x % 10;
            x = x / 10;
            pal = pal * 10 + l;
        }

        return pal == org;
    }
}