package HackerRankTest;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import HackerRankAlgorithm.MiniMaxSum;

public class TestMiniMaxSum {

  @Before
  public void testClass() {
    MiniMaxSum miniMaxSum = new MiniMaxSum();

  }

  @Test
  public void testCLass() {
    MiniMaxSum test = new MiniMaxSum();

    List<Integer> arr = new ArrayList<Integer>();

    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);

    int[] result = {10, 14};

    assertTrue("check if the min and max sum is shown", Arrays.equals(test.minMaxSum(arr), result));
  }

}
