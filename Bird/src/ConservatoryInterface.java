public interface ConservatoryInterface {
    public void rescueBird();              // Allow you to rescue new birds and bring them into your conservatory
    public String calFood();              // calFood : Calculate what food needs to be kept and in what quantities
    public boolean assignBird(Bird bird); //addBird : Assign a bird to an aviary in the conservatory. Assignments must follow the following criteria:
    public int findBird(Bird bird);     // findBird : Have a guest look up which aviary a bird is in
    public String printSign(int index); //printSign : Print a sign for any given aviary that gives a description of the birds it houses and any interesting information that it may have about that animal.
    public String printMap();           // printMap Print a “map” that lists all the aviaries by location and the birds they house
    public String printIndex();        // printAllBirds :Print an index that lists all birds in the conservatory in alphabetical order and their location
}
