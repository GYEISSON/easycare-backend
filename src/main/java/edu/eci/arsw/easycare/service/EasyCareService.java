package edu.eci.arsw.easycare.service;

import edu.eci.arsw.easycare.model.*;

import java.util.List;
import java.util.Optional;

public interface EasyCareService {

    Optional<Cliente> getCliente(Long id);

    List<Cliente> getAllClintes();

    void saveCliente(Cliente cliente);

    Optional<Mascota> getMascota(Long id);

    List<Mascota> getMascotas();

    void saveMascota(Mascota mascota);

    Optional<Paseador> getPaseador(Long id);

    List<Paseador> getPaseadores();

    void savePaseador(Paseador paseador);

    Optional<Paseo> getPaseo(Long id);

    List<Paseo> getPaseos();

    void savePaseo(Paseo paseo);

    Optional<Subasta> getSubasta(Long id);

    List<Subasta> getSubastas();

    void saveSubasta(Subasta subasta);
}
