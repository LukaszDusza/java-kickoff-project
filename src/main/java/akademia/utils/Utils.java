package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public double getNumberOfPeople(Planet planet) {
            double avgHeightInMeters = 1.7;
        return planet.getDistance()/avgHeightInMeters;
    }
}
