package akademia.services;


import akademia.models.Planet;
import akademia.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlanetService {
    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public List<Planet> getPlanetByName(String name){
        return planetRepository.getPlanetByName(name);
    }
}
