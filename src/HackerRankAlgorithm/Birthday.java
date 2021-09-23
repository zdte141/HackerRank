package HackerRankAlgorithm;

import java.util.List;

public class Birthday {

  public int birthday(List<Integer> candles) {
    int frequency = 0;
    int max = 0;

    for (int i = 0; i < candles.size(); i++) {
      max = Math.max(max, candles.get(i));
    }
    for (int j = 0; j < candles.size(); j++) {
      if (max == candles.get(j)) {
        frequency++;
      }
    }
    return frequency;
  }
  /**
   * public int birthday(int[] n) { int frequency = 0; int max = 0;
   * 
   * for (int i = 0; i < n.length; i++) { max = Math.max(max, n[i]); } for (int j = 0; j < n.length;
   * j++) { if (max == n[j]) { frequency++; } } System.out.println(frequency); return frequency; }
   */


}
