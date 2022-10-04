package com.hospital.crm.controller;

import com.hospital.crm.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController<PacienteService> {

    @Autowired 
    private PacienteService service;


}
