package com.hospital.crm.controller;

import com.hospital.crm.models.Medico;
import com.hospital.crm.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @GetMapping
    public List<Medico> findAll() {return service.findAll();}

    @GetMapping("/{id}")
    public Medico findById(@PathVariable Long id) {return service.findById(id);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id);}

    @PostMapping
    public Medico create(@RequestBody Medico medico) {return service.create(medico);}
}