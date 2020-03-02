package edu.eci.arsw.easycare.model.repository;

import edu.eci.arsw.easycare.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
