package com.hospital.crm.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TBL_PACIENTE")

public class Paciente {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(length = 11, unique = true)
    @CPF
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private Date datanascimento;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
