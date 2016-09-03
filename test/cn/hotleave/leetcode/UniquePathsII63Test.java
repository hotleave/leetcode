package cn.hotleave.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class UniquePathsII63Test {
    @Test
    public void uniquePathsWithObstacles() throws Exception {
        UniquePathsII63 solution = new UniquePathsII63();
        int[][] grid = new int[20][20];
        assertEquals(985525432, solution.uniquePathsWithObstacles(grid));

        // fails oj
        grid = new int[1][1];
        grid[0][0] = 1;
        assertEquals(0, solution.uniquePathsWithObstacles(grid));

        grid = new int[2][2];
        grid[1][1] = 1;
        assertEquals(0, solution.uniquePathsWithObstacles(grid));
    }

}