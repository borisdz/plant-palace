package mk.ukim.finki.uiktp.plantpalace.repository;

import mk.ukim.finki.uiktp.plantpalace.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
