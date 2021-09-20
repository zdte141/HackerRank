package HackerRankAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

  public Object plusMinus(List<Integer> arr) {
    List<Double> result = new ArrayList<Double>();
    int n = arr.size();
    double posCount = 0;
    double negCount = 0;
    double zeroCount = 0;

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) > 0) {
        posCount++;
      } else if (arr.get(i) < 0) {
        negCount++;
      } else {
        zeroCount++;
      }
    }
    System.out.println(posCount / n);
    System.out.println(negCount / n);
    System.out.println(zeroCount / n);

    result.add(posCount / n);
    result.add(negCount / n);
    result.add(zeroCount / n);

    return result;
  }
}
