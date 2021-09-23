package HackerRankTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import HackerRankAlgorithm.Birthday;

public class TestBirthday {
  @Before
  public void testClass() {
    Birthday birthday = new Birthday();
  }

  @Test
  public void testBirthday() {
    Birthday test = new Birthday();

    int[] n = {3, 2, 1, 3};

    int output = 2;

    assertTrue("check if the method return the most common height of candles",
        test.birthday(n) == output);

  }

}
