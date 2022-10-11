package com.hospital.crm.controller;

import com.hospital.crm.models.Atendimento;
import com.hospital.crm.models.Paciente;
import com.hospital.crm.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;

@RestController
@RequestMapping(value = "/api/atendimento")
public class AtendimentoController {

    @Autowired
    private AtendimentoService service;

    @GetMapping
    public List<Atendimento> findAll() {return service.findAll();
    }

    @GetMapping("/{id}")
    public Atendimento findById(@PathVariable Long id) {return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id);
    }

    @PostMapping
    public Atendimento create(@RequestBody Atendimento atendimento) {return service.create(atendimento);
    }
}


