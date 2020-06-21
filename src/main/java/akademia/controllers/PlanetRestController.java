package akademia.controllers;


import akademia.models.Planet;
import akademia.services.PlanetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlanetRestController {
    private final PlanetService planetService;

    public PlanetRestController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping("/planets")
    public List<Planet> getAllPlanets(){
        return planetService.getAllPlanets();
    }
    @PostMapping
    public Planet addCar(@RequestBody Planet planet) {
        return planetService.addPlanet(planet);
    }

}
