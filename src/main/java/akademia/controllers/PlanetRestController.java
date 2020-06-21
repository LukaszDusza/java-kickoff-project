package akademia.controllers;


import akademia.services.PlanetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PlanetRestController {
    private PlanetService planetService;

    public PlanetRestController(PlanetService planetService) {
        this.planetService = planetService;
    }
}
