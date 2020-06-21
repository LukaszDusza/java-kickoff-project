package akademia.utils;

import akademia.models.Planet;

public class Utils extends Planet {

     public double distanceByBikes(Planet planet) {

        Double averageSpeedByKm = 15.5;
        Double averageSpeedByM = averageSpeedByKm*1000;
        Double averageTime = planet.getDistance()/averageSpeedByM;
         System.out.println("Czas potrzebny na dojazd rowerem do: " + planet.getName() + " to: " + averageTime + "s");

         return averageTime;

    }
}
