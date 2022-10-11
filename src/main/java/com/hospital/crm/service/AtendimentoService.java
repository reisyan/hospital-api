package com.hospital.crm.service;

import com.hospital.crm.models.Atendimento;
import com.hospital.crm.repositories.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public List<Atendimento> findAll() {return atendimentoRepository.findAll();}

    public Atendimento findById(Long id) {return atendimentoRepository.findById(id).get();}

    public void deleteById(Long id) {atendimentoRepository.deleteById(id);}

    public Atendimento create(Atendimento atendimento) {return atendimentoRepository.saveAndFlush(atendimento);}
}
