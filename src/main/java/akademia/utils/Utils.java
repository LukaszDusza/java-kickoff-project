package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public double getNumberOfPeople(Planet planet) {
            double avgHeight = 1.7; // [m]
        return planet.getDistance()/avgHeight;
    }
}
