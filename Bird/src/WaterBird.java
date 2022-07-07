import java.util.ArrayList;

public class WaterBird extends BirdImp{
  private String waterBody;
  public WaterBird(String type, String definingCharacteristic, boolean extinction,
      int numberofwings, ArrayList<Food> food, String waterBody) {
    super(type, definingCharacteristic, extinction, numberofwings, food);
    this.waterBody = waterBody;
  }
}
