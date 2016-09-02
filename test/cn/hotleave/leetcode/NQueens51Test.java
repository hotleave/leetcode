package cn.hotleave.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class NQueens51Test {
    @Test
    public void solveNQueens() throws Exception {
        NQueens51 solution = new NQueens51();
        List<List<String>> results = solution.solveNQueens(5);
        System.out.println(results);
    }

}