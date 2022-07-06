import java.util.ArrayList;

public interface Bird {
  public String getType();

  public String getCharacteristic();

  public boolean getExtinction();

  public int getNumberOfWings();

  public ArrayList<Food> getFood();
}
