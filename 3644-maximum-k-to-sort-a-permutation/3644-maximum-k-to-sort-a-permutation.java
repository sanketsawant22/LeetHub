class Solution {
    public int sortPermutation(int[] nums) {
        int and = -1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                and = and & nums[i];
            }
        }

        return and == -1 ? 0 : and;
    }
}