package HackerRankAlgorithm;

import java.util.List;

public class Triplet {

  public int[] triplet(List<Integer> a, List<Integer> b) {
    int[] result = new int[2];

    for (int j = 0; j < a.size(); j++) {
      System.out.println(a.get(j));
    }
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        result[0]++;
      } else if (a.get(i) != b.get(i)) {
        result[1]++;
      }
    }
    return result;
  }

}
