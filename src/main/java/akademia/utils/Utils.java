package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public Double OlympicPool (Planet planet) {
        double poolDistance = 25;
        return planet.getDistance() / poolDistance;

    }
}
