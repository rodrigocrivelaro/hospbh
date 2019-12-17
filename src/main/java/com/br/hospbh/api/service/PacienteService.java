package com.br.hospbh.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.br.hospbh.api.model.Paciente;
import com.br.hospbh.api.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	public Paciente atualizar(Long codigo, Paciente paciente) {
		Paciente pacienteSalvo = buscarPacientePeloCodigo(codigo);

		BeanUtils.copyProperties(paciente, pacienteSalvo, "codigo");
		return pacienteRepository.save(pacienteSalvo);
	}

	public Paciente buscarPacientePeloCodigo(Long codigo) {
	    Paciente pacienteSalvo = pacienteRepository.getOne(codigo);

		if (pacienteSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pacienteSalvo;
	}
}
