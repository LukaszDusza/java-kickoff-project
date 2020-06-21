package akademia.controllers;


import akademia.models.Planet;
import akademia.services.PlanetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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
    @PostMapping("/planets")
    public Planet addPlanet(@RequestBody Planet planet) {
        return planetService.addPlanet(planet);
    }

    @DeleteMapping("/planets/{id}")
    public void deletePlanetById(@PathVariable long id) {
        planetService.deleteById(id);
    }

    @GetMapping("/planets/{id}")
    public Planet getPlanetById(@PathVariable long id) {
        return planetService.getPlanetById(id).orElseThrow(EntityNotFoundException::new);
    }


}
