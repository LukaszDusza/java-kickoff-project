package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public Double OlympicPool (Planet planet) {
        double poolDistance = 50;
        return planet.getDistance() / poolDistance;

    }
}
