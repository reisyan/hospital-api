package com.hospital.crm.repositories;

import com.hospital.crm.models.Paciente;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    Optional<Paciente> findByCpf(String cpf);
}

