
import java.util.ArrayList;

public class Parrot extends BirdImp {
  int vocabulary;
  String favoriteWord;
  public Parrot(String type, boolean extinction, ArrayList<Food> food,int vocabulary,String favoriteWord)
  {
    super(type, "have a short, curved beak and are known for their intelligence and ability to mimic sounds", extinction, 2, food);
    this.vocabulary = vocabulary;
    this.favoriteWord = favoriteWord;
  }

  public void setFavoriteWord(String favoriteWord) {
    this.favoriteWord = favoriteWord;
  }

  public void setVocabulary(int vocabulary) {
    this.vocabulary = vocabulary;
  }

  public int getVocabulary() {
    return vocabulary;
  }

  public String getFavoriteWord() {
    return favoriteWord;
  }

}

