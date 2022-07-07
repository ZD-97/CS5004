import java.util.ArrayList;

public class ShoreBird extends WaterBird{

  public ShoreBird(String type,boolean extinction,String waterBody, ArrayList<Food> food)
  {
    super(type,"live near water sources including wetlands",extinction,food, waterBody);
  }

}
