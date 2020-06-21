package akademia.utils;

import akademia.models.Planet;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Utils {

  public static Long equatorDimension (Planet planet) {
    long planetDistance = Long.parseLong(planet.getDistance());
    long equatorDistance = 40075000L;
    long distanceBetween = planetDistance/equatorDistance;
    return distanceBetween;
  }

}
