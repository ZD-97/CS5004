import java.util.ArrayList;

public class Waterfowl extends WaterBird {
  public Waterfowl(String type,boolean extinction,String waterBody, ArrayList<Food> food) {
    super(type,"live near water sources (fresh or salt) and include ducks, swans, and geese",extinction,food, waterBody);
  }
}
