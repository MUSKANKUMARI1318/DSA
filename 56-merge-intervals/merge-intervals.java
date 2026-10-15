class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][2];
        int index = 0;

        for (int[] interval : intervals) {
            if (index == 0 || result[index - 1][1] < interval[0]) {
                result[index++] = interval;
            } else {
                result[index - 1][1] = Math.max(
                    result[index - 1][1], interval[1]
                );
            }
        }

        return Arrays.copyOf(result, index);
    }
}
