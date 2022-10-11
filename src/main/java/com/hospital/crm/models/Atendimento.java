package com.hospital.crm.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TBL_ATENDIMENTO")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private Date dataDeAtendimento;

    @Column( nullable = false, length = 50)
    private String nomeDoPaciente;

    @Column( nullable = false, length = 50)
    private String nomeDoMedico;

    @Column( nullable = false, length = 50)
    private String observacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id", updatable = false, insertable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico", updatable = false, insertable = false)
    private Medico medico ;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataDeAtendimento() {
        return dataDeAtendimento;
    }

    public void setDataDeAtendimento(Date dataDeAtendimento) {
        this.dataDeAtendimento = dataDeAtendimento;
    }

    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public void setNomeDoPaciente(String nomeDoPaciente) {
        this.nomeDoPaciente = nomeDoPaciente;
    }

    public String getNomeDoMedico() {
        return nomeDoMedico;
    }

    public void setNomeDoMedico(String nomeDoMedico) {
        this.nomeDoMedico = nomeDoMedico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
