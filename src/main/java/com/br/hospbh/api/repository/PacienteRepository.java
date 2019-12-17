package com.br.hospbh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.hospbh.api.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
}
