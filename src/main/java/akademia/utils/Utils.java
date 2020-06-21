package akademia.utils;

import akademia.models.Planet;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Utils {

  public static Long equatorDimension (Planet planet) {
    long equatorDistancePerMeter = 40075000L;
    return planet.getDistance()/equatorDistancePerMeter;
  }

}
