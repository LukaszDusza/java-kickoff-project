package akademia.utils;

import akademia.models.Planet;

public class Utils {

    public double getNumberOfPeople(Planet planet) {
            double avgHeight = 1.7; // [m]
            double NumberOfPeople = planet.getDistance()/avgHeight;
        return NumberOfPeople;
    }
}
