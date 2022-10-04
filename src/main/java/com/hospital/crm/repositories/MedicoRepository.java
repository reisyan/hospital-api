package com.hospital.crm.repositories;

import com.hospital.crm.models.Medico;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
