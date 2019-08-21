import org.junit.Assert;
import org.junit.Test;

public class IslandCounterTest {

  @Test
  public void test01() {
    int[][] matrix = new int[][]{
        {0, 1, 0, 0, 1},
        {0, 1, 1, 0, 0},
        {1, 1, 1, 0, 0},
        {0, 1, 0, 0, 1}
    };
    int count = IslandCounter.count(matrix);
    Assert.assertEquals(3, count);
  }

  @Test
  public void test02() {
    int[][] matrix = new int[][]{
        {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}
    };
    int count = IslandCounter.count(matrix);
    Assert.assertEquals(1, count);
  }

  @Test
  public void test03() {
    int[][] matrix = new int[][]{
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
    };
    int count = IslandCounter.count(matrix);
    Assert.assertEquals(0, count);
  }

  @Test
  public void test04() {
    int[][] matrix = new int[][]{
        {1, 0, 1, 0},
        {0, 1, 0, 1},
        {1, 0, 1, 0},
        {0, 1, 0, 1}
    };
    int count = IslandCounter.count(matrix);
    Assert.assertEquals(1, count);
  }


  @Test
  public void test05() {
    int[][] matrix = new int[][]{
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 0, 1, 1}
    };
    int count = IslandCounter.count(matrix);
    Assert.assertEquals(2, count);
  }
}