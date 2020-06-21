package akademia.utils;

import akademia.models.Planet;

public class Utils {
public Long  bottelCount (Planet planet){
  double bottle= 0.2 ;
 long count;
  return (long) (planet.getDistance()/bottle);
 }
}
