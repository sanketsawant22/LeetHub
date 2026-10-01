class Solution {

    Map<Character, String> map = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(digits, 0, "");

        return ans;
    }

    public void backtrack(String digits, int index, String current) {

        if(index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map.get(digits.charAt(index));

        for(char ch : letters.toCharArray()) {
            backtrack(digits, index + 1, current + ch);
        }
    }
}