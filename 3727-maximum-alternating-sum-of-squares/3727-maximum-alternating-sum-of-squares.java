
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {

        // Arrays.sort(nums);

        long ans = 0;
        int n = nums.length;

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) ->
            Integer.compare(Math.abs(a), Math.abs(b))
        );

        for (int i = n - 1; i >= n / 2; i--) {
            ans += (long) arr[i] * arr[i];
        }

        for (int i = 0; i < n / 2; i++) {
            ans -= (long) arr[i] * arr[i];
        }

        return ans;
    }
}
