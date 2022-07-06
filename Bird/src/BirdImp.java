import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BirdImp implements Bird{

  private String type;
  private String definingCharacteristic;
  private boolean extinction;
  private int numberofwings;
  private ArrayList<Food> food;

  public BirdImp(String type, String definingCharacteristic, boolean extinction, int numberofwings,
      ArrayList<Food> food) {
    this.type = type;
    this.definingCharacteristic = definingCharacteristic;
    this.extinction = extinction;
    this.numberofwings = numberofwings;
    this.food = food;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public String getCharacteristic() {
    return this.definingCharacteristic;
  }

  @Override
  public boolean getExtinction() {
    return this.extinction;
  }

  @Override
  public int getNumberOfWings() {
    return this.numberofwings;
  }

  @Override
  public ArrayList<Food> getFood() {
    return this.food;
  }
}
