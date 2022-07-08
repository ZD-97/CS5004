import java.util.ArrayList;

public interface Aviary {


  public ArrayList<Bird> getBird();

  public boolean addBirds(Bird bird);

  public boolean isConflict(Bird bird);

  public String printAviary();

}
