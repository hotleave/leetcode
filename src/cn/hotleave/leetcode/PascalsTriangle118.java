package cn.hotleave.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hotleave on 16-12-27.
 */
public class PascalsTriangle118 {
    /**
     * given numRows, generate the first numRows of Pascal's triangle.
     * <p>
     * For example, given numRows = 5,
     * Return
     * <p>
     * [
     * [1],
     * [1,1],
     * [1,2,1],
     * [1,3,3,1],
     * [1,4,6,4,1]
     * ]
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        if (numRows < 1) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>(numRows);
        Integer[] lastRow = null;
        if (numRows >= 1) {
            lastRow = new Integer[] {1};
            result.add(Arrays.asList(lastRow));
        }

        if (numRows >= 2) {
            for (int i = 1; i < numRows; i++) {
                Integer[] row = new Integer[i + 1];
                row[0] = 1;
                row[i] = 1;

                for (int j = 1; j < i; j++) {
                    row[j] = (lastRow[j - 1] + lastRow[j]);
                }

                result.add(Arrays.asList(row));
                lastRow = row;
            }
        }

        return result;
    }
}
