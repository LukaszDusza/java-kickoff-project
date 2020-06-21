package akademia.controllers;

import akademia.services.PlanetService;
import org.springframework.stereotype.Controller;

@Controller
public class PlanetController {
    private PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }
}
