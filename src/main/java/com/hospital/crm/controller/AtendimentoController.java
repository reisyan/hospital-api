package com.hospital.crm.controller;

import com.hospital.crm.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/atendimento")
public class AtendimentoController {

    @Autowired
    private AtendimentoService service;


}

