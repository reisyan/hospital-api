package com.hospital.crm.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TBL_MEDICO")

public class Medico {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(unique = true, nullable = false, length = 15)
    private String crm;

    @NotBlank(message = "CPF é obrigatório")
    @Column(length = 11, unique = true)
    @CPF
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private Date datanascimento;





    
}
