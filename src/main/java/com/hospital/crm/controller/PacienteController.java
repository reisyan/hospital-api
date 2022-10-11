package com.hospital.crm.controller;

import com.hospital.crm.models.Paciente;
import com.hospital.crm.repositories.PacienteRepository;
import com.hospital.crm.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> findAll() {return service.findAll();
    }

    @GetMapping("/{id}")
    public Paciente findById(@PathVariable Long id) {return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id);
    }

    @PostMapping
    public Paciente create(@RequestBody Paciente paciente) {
        return service.create(paciente);
    }
}
