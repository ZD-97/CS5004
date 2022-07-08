import java.util.ArrayList;

public class Pigeon extends BirdImp{

  public Pigeon(String type, boolean extinction, ArrayList<Food> food) {
    super(type,"feeding their young bird milk", extinction,2, food);
  }
}
