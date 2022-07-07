import java.util.ArrayList;

public class Parrot extends BirdImp{

  public Parrot(String type, String definingCharacteristic, boolean extinction, int numberofwings,
      ArrayList<Food> food) {
    super(type, "Intelligence and ability to mimic sounds", extinction, 2, food);
  }
}
