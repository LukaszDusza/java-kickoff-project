package akademia.utils;
// autor Maciej Żelechowski

import akademia.models.Planet;

public class Utils {
  public long crocodileLength(Planet planet) {
    final double crocodile = 4.37;
    return (long) (planet.getDistance() / crocodile);
  }
}