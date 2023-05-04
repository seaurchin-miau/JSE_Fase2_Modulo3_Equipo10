package com.example.demo.negocio;

import com.example.demo.modelo.Cita;
import com.example.demo.repositorio.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository repository;

    public CitaServiceImpl(CitaRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void guardar(Cita cita) {

        if (repository.findAllByContenido(cita.getContenido()).size() > 0) {
            throw new RuntimeException("La cita ya fue registrada");
        }

        repository.save(cita);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Cita buscarPorId(Long id) {
        return repository.findById(id).get();
    }
}