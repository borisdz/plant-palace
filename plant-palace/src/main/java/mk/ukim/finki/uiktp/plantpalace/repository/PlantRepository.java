package mk.ukim.finki.uiktp.plantpalace.repository;


import mk.ukim.finki.uiktp.plantpalace.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Long> {
}
