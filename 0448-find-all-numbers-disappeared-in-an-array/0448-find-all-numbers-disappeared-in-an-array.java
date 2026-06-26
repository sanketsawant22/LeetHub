class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        int[] ans = new int[nums.length];

        for (int num : nums) {
            ans[num - 1] = 1;
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}