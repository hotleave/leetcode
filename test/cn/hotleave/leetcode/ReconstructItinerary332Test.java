package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class ReconstructItinerary332Test {
    @Test
    public void findItinerary() throws Exception {
        String[][] tickets = new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        ReconstructItinerary332 solution = new ReconstructItinerary332();
        assertEquals("[JFK, MUC, LHR, SFO, SJC]", solution.findItinerary(tickets).toString());

        tickets = new String[][]{{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
        assertEquals("[JFK, ATL, JFK, SFO, ATL, SFO]", solution.findItinerary(tickets).toString());

        // submit fails
        tickets = new String[][]{{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}};
        assertEquals("[JFK, NRT, JFK, KUL]", solution.findItinerary(tickets).toString());

        tickets = new String[][]{{"EZE", "TIA"}, {"EZE", "AXA"}, {"AUA", "EZE"}, {"EZE", "JFK"}, {"JFK", "ANU"}, {"JFK", "ANU"}, {"AXA", "TIA"}, {"JFK", "AUA"}, {"TIA", "JFK"}, {"ANU", "EZE"}, {"ANU", "EZE"}, {"TIA", "AUA"}};
        assertEquals("[JFK, ANU, EZE, AXA, TIA, AUA, EZE, JFK, ANU, EZE, TIA, JFK, AUA]", solution.findItinerary(tickets).toString());

        tickets = new String[][]{{"EZE", "TIA"}, {"EZE", "HBA"}, {"AXA", "TIA"}, {"JFK", "AXA"}, {"ANU", "JFK"}, {"ADL", "ANU"}, {"TIA", "AUA"}, {"ANU", "AUA"}, {"ADL", "EZE"}, {"ADL", "EZE"}, {"EZE", "ADL"}, {"AXA", "EZE"}, {"AUA", "AXA"}, {"JFK", "AXA"}, {"AXA", "AUA"}, {"AUA", "ADL"}, {"ANU", "EZE"}, {"TIA", "ADL"}, {"EZE", "ANU"}, {"AUA", "ANU"}};
        assertEquals("[JFK, AXA, AUA, ADL, ANU, AUA, ANU, EZE, ADL, EZE, ANU, JFK, AXA, EZE, TIA, AUA, AXA, TIA, ADL, EZE, HBA]", solution.findItinerary(tickets).toString());
    }

}