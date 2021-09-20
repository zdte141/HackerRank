package HackerRankTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import HackerRankAlgorithm.Sum;

public class TestTDD {
  @Before
  public void testClass() {
    Sum sum = new Sum();

  }

  @Test
  public void testSum() {
    Sum test = new Sum();

    int n = 4;

    int output = 8;

    assertTrue("check the junit is driving correctly", test.sum(n) == output);
  }

}
