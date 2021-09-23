package HackerRankAlgorithm;

public class Birthday {

  public int birthday(int[] n) {
    int frequency = 0;
    int max = 0;

    for (int i = 0; i < n.length; i++) {
      max = Math.max(max, n[i]);
    }
    for (int j = 0; j < n.length; j++) {
      if (max == n[j]) {
        frequency++;
      }
    }
    System.out.println(frequency);
    return frequency;
  }

}
