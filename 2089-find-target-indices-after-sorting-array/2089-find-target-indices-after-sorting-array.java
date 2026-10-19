class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> ans = new ArrayList<>();

        int less = 0;
        int count = 0;

        for(int num: nums) {
            if(num == target) {
                count++;
            }

            if(num < target) {
                less++;
            }
        }

        for(int i=0; i<count; i++) {
            ans.add(less);
            less++;
        }

        return ans;

    }
}