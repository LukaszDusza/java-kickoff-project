package akademia.repository;


import akademia.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
  @Query(value = "select * from Planet order by asc",nativeQuery=true)
  List<Planet> getPlanetsByDistance();
}
