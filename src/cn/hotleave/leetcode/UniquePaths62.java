package cn.hotleave.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-paths/
 *
 * @author hotleave
 */
public class UniquePaths62 {
    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * <p>
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     * <p>
     * How many possible unique paths are there?
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        if (m == 2) {
            return n;
        }

        if (n == 2) {
            return m;
        }

        // 5,5 can be split into 4,5 + 4,4 + 4,3 + 4,2 + 51
        // 4,5 can be split into 3,5 + 3,4 + 3,3 + 3,2 + 41
        // and so on

        int[] numbers = new int[n];
        Arrays.fill(numbers, 1);

        int times, tmp;
        int total = 0;
        boolean add;
        for (int i = m - 1; i > 1; i--) {
            times = 0;
            add = i == 2;
            for (int j = 0; j < n; j++) {
                tmp = numbers[j];
                if (add) {
                    total += tmp + times;
                } else {
                    numbers[j] += times;
                }
                times += tmp;
            }
        }

        return total;
    }

    private int badUniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return badUniquePaths(m - 1, n) + badUniquePaths(m, n - 1);
    }
}
