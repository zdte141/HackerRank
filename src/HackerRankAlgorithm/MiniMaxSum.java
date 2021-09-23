package HackerRankAlgorithm;

import java.util.List;

public class MiniMaxSum {

  public int[] minMaxSum(List<Integer> arr) {
    int[] result = new int[2];
    int min = 0, max = 0, sum = 0;
    min = arr.get(0);
    max = min;
    sum = min;
    for (int i = 1; i < arr.size(); i++) {
      sum += arr.get(i);
      if (arr.get(i) < min) {
        min = arr.get(i);
      }
      if (arr.get(i) > max) {
        max = arr.get(i);
      }
    }
    result[0] = sum - max;
    result[1] = sum - min;
    System.out.print((sum - max) + " " + (sum - min));
    return result;

  }



}
