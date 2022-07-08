import java.util.ArrayList;


public class WaterBird extends BirdImp {
      private String waterBody;
      public WaterBird(String type,String definingCharacteristic ,boolean extinction, ArrayList<Food> food,String waterBody) {
          super(type, definingCharacteristic, extinction, 2, food);
          this.waterBody = waterBody;
      }
      public String getWaterBody() {
        return waterBody;
      }

}
