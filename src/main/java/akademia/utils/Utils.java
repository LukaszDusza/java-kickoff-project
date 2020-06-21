package akademia.utils;

import akademia.models.Planet;

public class Utils {
public Long  bottelCount (Planet planet){
  double bootel= 0.2 ;
 long count;
  return (long) (planet.getDistance()/bootel);
  }
}
