package cn.hotleave.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hotleave on 16-12-27.
 */
public class PascalsTriangle118Test {
    @Test
    public void generate() throws Exception {
        PascalsTriangle118 solution = new PascalsTriangle118();
        List<List<Integer>> result = solution.generate(5);
        System.out.println(result);
    }

}