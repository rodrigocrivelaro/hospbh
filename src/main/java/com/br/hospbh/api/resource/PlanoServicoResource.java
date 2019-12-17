package com.br.hospbh.api.resource;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.hospbh.api.model.PlanoServico;
import com.br.hospbh.api.repository.PlanoServicoRepository;
import com.br.hospbh.api.service.PacienteService;

public class PlanoServicoResource {
	
//	@Autowired
//	private PlanoServicoRepository planoServicoRepository;
//	
//	@Autowired
//	private ApplicationEventPublisher publisher;
//	
//	@Autowired
//	private PacienteService pacienteService;
//	
//	public ResponseEntity<Optional<PlanoServico>> buscarPeloPlano(@PathVariable int plano, HttpServletResponse response) {
//		if (planoServicoRepository.findById(codigo) != null) {
//			return ResponseEntity.ok().body(planoServicoRepository.findById(codigo));
//		} else {
//			return ResponseEntity.notFound().build();
//		}
//	}
}
