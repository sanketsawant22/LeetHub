class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        boolean[] removed = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {

                // interval i covers interval j
                if (intervals[i][0] <= intervals[j][0] &&
                    intervals[j][1] <= intervals[i][1]) {
                    removed[j] = true;
                }

                // interval j covers interval i
                if (intervals[j][0] <= intervals[i][0] &&
                    intervals[i][1] <= intervals[j][1]) {
                    removed[i] = true;
                }
            }
        }

        int count = 0;
        for (boolean r : removed) {
            if (!r) count++;
        }

        return count;
    }
}