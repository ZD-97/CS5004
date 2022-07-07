import java.util.ArrayList;

public class ShoreBird extends WaterBird{

  public ShoreBird(String type, String definingCharacteristic, boolean extinction,
      int numberofwings,
      ArrayList<Food> food, String waterBody) {
    super(type, "Intelligence and ability to mimic sounds", extinction, 2, food, waterBody);
  }
}
