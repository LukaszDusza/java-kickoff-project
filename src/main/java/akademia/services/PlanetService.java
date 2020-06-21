package akademia.services;

import akademia.models.Planet;
import akademia.repository.PlanetRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class PlanetService {
    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }


    public Optional<Planet> getPlanetByID (@PathVariable(value = "id") long id){
        return planetRepository.findById(id);
    }
}
