package cn.hotleave.leetcode;

import java.util.*;

/**
 * Created by hotleave on 16-12-27.
 */
public class TopKFrequentElements347 {
    /**
     * Given a non-empty array of integers, return the k most frequent elements.
     * <p>
     * For example,
     * Given [1,1,1,2,2,3] and k = 2, return [1,2].
     * <p>
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
     * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     *
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        // store each number's freq in the map
        final Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            Integer count = countMap.get(num);
            if (count == null) {
                count = 0;
            }

            countMap.put(num, ++count);
        }

        // use the priority query to store the first k+1 number
        Queue<Integer> queue = new PriorityQueue<>(k + 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return countMap.get(o1) - countMap.get(o2);
            }
        });

        // put the numbers into the queue
        for (Integer number : countMap.keySet()) {
            queue.offer(number);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // fetch the result from the queue
        // if use the ArrayList directly, and use list.add(int, Object) will cause IndexOutOfRangeException
        Integer[] result = new Integer[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        // convert to list
        return Arrays.asList(result);
    }
}
