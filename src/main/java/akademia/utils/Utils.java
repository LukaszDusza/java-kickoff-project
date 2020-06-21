package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public Double olympicPool (Planet planet) {
        double poolDistance = 50;
        return planet.getDistance() / poolDistance;

    }
}
