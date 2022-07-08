import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conservatory implements ConservatoryInterface{
  private ArrayList<AviaryImp> Aviarys = new ArrayList<>();
  private final int CAPACITY = 20;
  private int size;

  public Conservatory() {
      size = 1;
      Aviarys.add(new AviaryImp());
  }

  /** Rescue Bird and bring it into your conservatory
   */
  @Override
  public void rescueBird(Bird bird) {
      assignBird(bird);
  }


  /** Calculate what food needs to be kept and in what quantities
   */
  @Override
  public String calFood() {
      StringBuilder sb = new StringBuilder();
      for(Food f:Food.values()) {
          sb.append(f);
          sb.append(": ");
          sb.append(f.getQuantity());
          sb.append("\n");
      }
      return sb.toString();
  }


  /** Assign a bird to an aviary in the conservatory. Assignments must follow the following criteria
   */
  @Override
  public boolean assignBird(Bird bird) {
    boolean flag = false;
    for(AviaryImp element : Aviarys) {
        if(element.addBirds(bird)){
            flag = true;
            break;
        }
    }
    if(flag == false && size<20) {
      AviaryImp newAviary = new AviaryImp();
      newAviary.addBirds(bird);
      Aviarys.add(newAviary);
      size++;
      flag = true;
    }
    if(size == 20 && flag == false) {
      throw new RuntimeException("The conservatory is full!!");
    }
    if(flag == true) {
        for(Food f: bird.getFood()) {
            f.addQuantity();
        }
    }
    return flag;
  }

  /**
   * Have a guest look up which aviary a bird is in.
   */
  @Override
  public int findBird(Bird bird) {
    for(AviaryImp eachAviary : Aviarys) {
        for(Bird eachBird : eachAviary.getBird()) {
            if(bird.getType().equals(eachBird.getType())) {
                   return Aviarys.indexOf(eachAviary);
            }
      }
    }
    return -1;
  }

  /** Print a sign for any given aviary.
   */
  @Override
  public String printSign(int index) {
    return Aviarys.get(index).toString();
  }

  /** Print a “map” that lists all the aviaries by location and the birds they house
   */
  @Override
  public String printMap() {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    for(AviaryImp eachAviary : Aviarys) {
      sb.append(String.format("Aviary %s:",++i));
      for(Bird eachBird : eachAviary.getBird()) {
          sb.append(eachBird.getType());
          sb.append(", ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  /**
   * Print an index that lists all birds in the conservatory in alphabetical order and their location
   *
   */
  @Override
  public String printIndex() {
    HashMap<String,Integer> map = new HashMap<>();
    for(AviaryImp eachAviary : Aviarys) {
      for(Bird eachBird : eachAviary.getBird()) {
        map.put(eachBird.getType(),Aviarys.indexOf(eachAviary));
      }
    }
    StringBuilder sb = new StringBuilder();
    SortedSet<String> keys = new TreeSet<>(map.keySet());
    for (String key : keys) {
      int value = map.get(key);
      sb.append(String.format(key+" %s"+"\n",value));
    }
    return sb.toString();
  }
}
