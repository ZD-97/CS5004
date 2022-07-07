import java.util.ArrayList;

public class Waterfowl extends WaterBird{

  public Waterfowl(String type, String definingCharacteristic, boolean extinction,
      int numberofwings,
      ArrayList<Food> food, String waterBody) {
    super(type, "Live near water sources", extinction, 2, food, waterBody);
  }
}
