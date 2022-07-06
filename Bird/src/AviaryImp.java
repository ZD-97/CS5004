public class AviaryImp implements Aviary{
  private Bird[] brids;
  private final int CAPICITY = 5;
  private int numOfBirds;
  private String birdType;
  private final String FLIGHTLESSBIRDS = "FlightlessBirds";
  private final String BIRDOFPREY = "BirdOfPrey";
  private final String WATERFOWL = "Waterfowl";
  private final String NOTSPECIFIC = "Not Specific";

  public AviaryImp(){
    brids = new Bird[CAPICITY];
    numOfBirds = 0;
    birdType = NOTSPECIFIC;
  }

  @Override
  public Bird[] getBird() {
    return this.brids;
  }

  @Override
  public void setBirds(Bird[] birds) {
    if (birds.length > CAPICITY) {
      throw new IllegalArgumentException("No aviary can house more than 5 birds");
    }
    Bird[] newBirds = new Bird[5];
    for (int i = 0; i < birds.length; i++) {
      newBirds[i] = birds[i];
    }
    this.brids = newBirds;
    this.numOfBirds = birds.length;
  }

  @Override
  public boolean isConflict() {
    for (int i = 0; i < brids.length; i++) {

    }
  }

  @Override
  public String printAviary() {
    return null;
  }
}
