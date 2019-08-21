public class IslandCounter {
  public static int count(final int[][] matrix) {
    int count = 0;
    int [][] visitedPositions = new int[matrix.length][matrix[0].length];

    int lastVisitedPosX = 0;
    int lastVisitedPosY = 0;
    Coordinate coordinate;

    do {
      coordinate =
          findNextAvailblePosition(matrix, visitedPositions, lastVisitedPosX, lastVisitedPosY);
      if (coordinate != null) {
        count++;
        markContinuosLand(matrix, visitedPositions, coordinate.x, coordinate.y);
        lastVisitedPosX = coordinate.x;
        lastVisitedPosY = coordinate.y;
      }
    } while (coordinate != null);

    return count;
  }

  private static void markContinuosLand(int[][] matrix, int[][] visitedPositions, int posX, int posY) {
    if (posX < 0 || posX >= matrix.length) return;
    if (posY < 0 || posY >= matrix[0].length) return;

    final boolean notVisited = visitedPositions[posX][posY] == 0;
    visitedPositions[posX][posY] = 1;
    if (matrix[posX][posY] == 1 && notVisited) {
      markContinuosLand(matrix, visitedPositions, posX-1, posY-1);
      markContinuosLand(matrix, visitedPositions, posX-1, posY);
      markContinuosLand(matrix, visitedPositions, posX-1, posY+1);
      markContinuosLand(matrix, visitedPositions, posX, posY-1);
      markContinuosLand(matrix, visitedPositions, posX, posY+1);
      markContinuosLand(matrix, visitedPositions, posX+1, posY-1);
      markContinuosLand(matrix, visitedPositions, posX+1, posY);
      markContinuosLand(matrix, visitedPositions, posX+1, posY+1);
    }
  }

  private static Coordinate findNextAvailblePosition(int[][] matrix, int[][] visitedPositions, int lastVisitedPosX, int lastVisitedPosY) {
    Coordinate coordinate = null;

    posXIteration : for (int posX = lastVisitedPosX; posX < matrix.length; posX++) {
      for (int posY = lastVisitedPosY; posY < matrix[0].length; posY++) {
        if (visitedPositions[posX][posY] == 0 && matrix[posX][posY] == 1) {
          coordinate = new Coordinate(posX, posY);
          break posXIteration;
        }
      }
    }

    return coordinate;
  }

  static class Coordinate {
    public int x;
    public int y;

    Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  private static void print(int[][] visitedPositions) {
    System.out.println();
    for (int x = 0; x < visitedPositions.length; x++) {
      for (int y = 0; y < visitedPositions[0].length; y++) {
        System.out.print(visitedPositions[x][y] + " ");
      }
      System.out.println();
    }
  }
}
