package com.hospital.crm.service;

import com.hospital.crm.models.Paciente;
import com.hospital.crm.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;


    @Autowired
    public PacienteService(PacienteRepository repository) {this.repository = repository;}

    public List<Paciente> findAll() {return repository.findAll();}

    public Paciente findById(Long id) {return repository.findById(id).get();}
    
    public void deleteById(Long id) {repository.deleteById(id);}

    public Paciente create(Paciente paciente) {return repository.saveAndFlush(paciente);}

}

