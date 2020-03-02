package edu.eci.arsw.easycare.service.impl;

import edu.eci.arsw.easycare.model.*;
import edu.eci.arsw.easycare.model.repository.*;
import edu.eci.arsw.easycare.service.EasyCareService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EasyCareServiceImpl implements EasyCareService {
    private final ClienteRepository clienteRepository;
    private final MascotaRepository mascotaRepository;
    private final PaseadorRepository paseadorRepository;
    private final PaseoRepository paseoRepository;
    private final SubastaRepository subastaRepository;

    public EasyCareServiceImpl(ClienteRepository clienteRepository, MascotaRepository mascotaRepository, PaseadorRepository paseadorRepository,
                               PaseoRepository paseoRepository, SubastaRepository subastaRepository) {
        this.clienteRepository = clienteRepository;
        this.mascotaRepository = mascotaRepository;
        this.paseadorRepository = paseadorRepository;
        this.paseoRepository = paseoRepository;
        this.subastaRepository = subastaRepository;
    }

    @Override
    public Optional<Cliente> getCliente(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> getAllClintes() {
        return clienteRepository.findAll();
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Optional<Mascota> getMascota(Long id) {
        return mascotaRepository.findById(id);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public Optional<Paseador> getPaseador(Long id) {
        return paseadorRepository.findById(id);
    }

    @Override
    public List<Paseador> getPaseadores() {
        return paseadorRepository.findAll();
    }

    @Override
    public void savePaseador(Paseador paseador) {
        paseadorRepository.save(paseador);
    }

    @Override
    public Optional<Paseo> getPaseo(Long id) {
        return paseoRepository.findById(id);
    }

    @Override
    public List<Paseo> getPaseos() {
        return paseoRepository.findAll();
    }

    @Override
    public void savePaseo(Paseo paseo) {
        paseoRepository.save(paseo);
    }

    @Override
    public Optional<Subasta> getSubasta(Long id) {
        return subastaRepository.findById(id);
    }

    @Override
    public List<Subasta> getSubastas() {
        return subastaRepository.findAll();
    }

    @Override
    public void saveSubasta(Subasta subasta) {
        subastaRepository.save(subasta);
    }


}