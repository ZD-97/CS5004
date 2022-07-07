import java.util.ArrayList;

public class FlightlessBird extends BirdImp {
  public FlightlessBird (String type, boolean extinction, ArrayList<Food> food)
  {
    super(type, "live on the ground", extinction, 0, food);
  }
}
