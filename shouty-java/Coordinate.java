public class Coordinate {
  private int x;
  private int y;

  public Coordinate(int xCoord, int yCoord){
    x = xCoord;
    y = yCoord;
  }

  public int distanceFrom(Coordinate other){
// TODO Actually calculate distance
    return 0;


// Maybe Pythagoras might be able to help...?
//  int xDiff = x - other.x;
//  int yDiff = y - other.y;

//  return (int) Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
  }
}