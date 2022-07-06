import java.util.HashMap;

public class Conservatory implements ConservatoryInterface{
  private Aviary[] arrAviary = new  Aviary[20];
  private HashMap<Food,Integer> food = new HashMap<>();
  public Conservatory() {
        
  }

  @Override
  public void rescueBird() {

  }

  @Override
  public String calFood() {
    return null;
  }

  @Override
  public boolean assignBird(Bird bird) {
    return false;
  }

  @Override
  public int findBird(Bird bird) {
    return 0;
  }

  @Override
  public String printSign(int index) {
    return null;
  }

  @Override
  public String printMap() {
    return null;
  }

  @Override
  public String printIndex() {
    return null;
  }
}
