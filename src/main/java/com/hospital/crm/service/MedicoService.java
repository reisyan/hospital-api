package com.hospital.crm.service;

import com.hospital.crm.models.Medico;
import com.hospital.crm.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> findAll() {return medicoRepository.findAll();}

    public Medico findById(Long id) {return (Medico) medicoRepository.findById(id).get();}

    public void deleteById(Long id) {medicoRepository.deleteById(id);}

    public Medico create(Medico medico) {return medicoRepository.saveAndFlush(medico);}
}
