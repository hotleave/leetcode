package cn.hotleave.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/reconstruct-itinerary/
 *
 * @author hotleave
 */
public class ReconstructItinerary332 {
    List<String> result;
    Map<String, PriorityQueue<String>> map;

    /**
     * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order.
     * <p>
     * All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.
     *
     * @param tickets
     * @return
     */
    public List<String> findItinerary(String[][] tickets) {
        if (tickets == null || tickets.length == 0) {
            return Collections.emptyList();
        }
        result = new ArrayList<>(tickets.length);
        map = new HashMap<>(tickets.length);

        String from;
        String to;
        for (String[] ticket : tickets) {
            from = ticket[0];
            to = ticket[1];

            if (!map.containsKey(from)) {
                map.put(from, new PriorityQueue<String>());
            }

            map.get(from).offer(to);
        }

        dfs("JFK");
        Collections.reverse(result);

        return result;
    }

    private void dfs(String cur) {
        if (map.containsKey(cur)) {
            PriorityQueue<String> queue = map.get(cur);
            while (!queue.isEmpty()) {
                dfs(queue.poll());
            }
        }

        result.add(cur);
    }
}
