import java.util.ArrayList;

public class AviaryImp implements Aviary{
  private ArrayList<Bird> birds;
  private final int CAPACITY = 5;
  private int size;
  private String birdType;
  private final String FLIGHTLESSBIRDS = "FlightlessBirds";
  private final String BIRDOFPREY = "BirdOfPrey";
  private final String WATERFOWL = "Waterfowl";
  private final String NOTSPECIFIC = "Not Specific";

  public AviaryImp(){
    size = 0;
    birdType = NOTSPECIFIC;
  }

  @Override
  public ArrayList<Bird> getBird() {
    return birds;
  }

  @Override
  /** This method add bird to an aviary, it takes a bird as an argument.
   *  Return true, if the add process is success. False otherwise.
   */
  public boolean addBirds(Bird bird) {

    if(size>=CAPACITY) {
        return false;
    } else if (bird.getExtinction()) {
        throw new IllegalArgumentException("Extincted Bird Can't be Added into an Aviary");
    } else if(size == 0) {
        birdType = bird.getType();
        birds.add(bird);
        size++;
        return true;
    } else {
        if(birdType == bird.getType()) {
            birds.add(bird);
            size++;
            return true;
        } else {
            return false;
        }
    }
  }

  @Override
  /** This method make a judge about whether there is any conflict for the bird to be added
   *  with existing bird.
   */
  public boolean isConflict(Bird bird) {
        if(size == 0) {
          return false;
        } else {
          return bird.getType() == birdType;
        }
  }

  @Override
  public String printAviary() {
    return null;
  }

  /** This method make a judge which type a bird is belonged to.
   */
  public String judgeType(Bird bird) {
    if(bird.getType() == "emus" || bird.getType() == "kiwis" || bird.getType() == "moas") {
      return FLIGHTLESSBIRDS;
    } else if(bird.getType() == "hawks" || bird.getType() == "eagles" || bird.getType() == "osprey") {
      return BIRDOFPREY;
    } else  if(bird.getType() == "ducks" || bird.getType() == "swan" || bird.getType() == "geese") {
      return WATERFOWL;
    } else {
      return NOTSPECIFIC;
    }
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("This aviary is for");
    sb.append(birdType);
    sb.append("birds.");
    for(Bird eachBird : birds){
        sb.append(eachBird.getType());
        sb.append(" can ");
        sb.append(eachBird.getCharacteristic());
    }
    return sb.toString();
  }

}
