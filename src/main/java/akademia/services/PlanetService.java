package akademia.services;

import akademia.models.Planet;
import akademia.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {
    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    public List<Planet> getPlanetByName(String name) {
        return planetRepository.getPlanetByName(name);
    }


    public void deleteById(Long id){
        planetRepository.deleteById(id);
    }

    public Planet addPlanet(Planet planet) {
      return planetRepository.save(planet);
    }
    public Optional<Planet> getPlanetById(long id) {
        return planetRepository.findById(id);
    }

}
