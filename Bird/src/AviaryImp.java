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
  public void setBirds() {
    if (birds.length > CAPICITY) {
      throw new IllegalArgumentException("No aviary can house more than 5 birds");
    }
    Bird[] newBirds = new Bird[5];
    for (int i = 0; i < birds.length; i++) {
      newBirds[i] = setBirds(brids);
    }
    return null;
  }

  @Override
  public boolean isConflict() {
    return false;
  }

  @Override
  public String printAviary() {
    return null;
  }
}
