package akademia.utils;
// autor Maciej Żelechowski
import akademia.models.Planet;

public class Utils {
  public Double  crocodileLength (Planet planet){
    final double  crocodile= 4.37 ;
    return planet.getDistance()/crocodile;
  }
}