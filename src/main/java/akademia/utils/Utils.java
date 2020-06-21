package akademia.utils;

import akademia.models.Planet;

public class Utils {
    public Double timeOnBike(Planet planet){
        return planet.getDistance() / 4.16666667;
    }


}
