package edu.eci.arsw.easycare.model.repository;

import edu.eci.arsw.easycare.model.Cliente;
import edu.eci.arsw.easycare.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
