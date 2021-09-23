package HackerRankTest;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import HackerRankAlgorithm.PlusMinus;

public class TestPlusMinus {
  @Before
  public void testClass() {
    PlusMinus plusMinus = new PlusMinus();

  }

  @Test
  public void testPlusMinus() {
    PlusMinus test = new PlusMinus();

    List<Integer> arr = new ArrayList<Integer>();

    arr.add(-4);
    arr.add(3);
    arr.add(-9);
    arr.add(0);
    arr.add(4);
    arr.add(1);

    List<Integer> result = new ArrayList<Integer>();
    result.add((int) 0.500000);
    result.add((int) 0.333333);
    result.add((int) 0.166667);

    assertTrue("check if the arr with method return the correct proportion",
        test.plusMinus(arr).equals(result));

  }

}
