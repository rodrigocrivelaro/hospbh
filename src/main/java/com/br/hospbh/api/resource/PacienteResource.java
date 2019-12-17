package com.br.hospbh.api.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.hospbh.api.event.RecursoCriadoEvent;
import com.br.hospbh.api.model.Paciente;
import com.br.hospbh.api.repository.PacienteRepository;
import com.br.hospbh.api.service.PacienteService;


@RestController
@RequestMapping("/pacientes")
public class PacienteResource {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> listar() {
		return pacienteRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Paciente> criar(@Valid @RequestBody Paciente paciente, HttpServletResponse response) {
		Paciente pacienteSalvo = pacienteRepository.save(paciente);

		publisher.publishEvent(new RecursoCriadoEvent(this, response, pacienteSalvo.getCodigo()));

		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<Paciente>> buscarPeloCodigo(@PathVariable Long codigo, HttpServletResponse response) {
		if (pacienteRepository.findById(codigo) != null) {
			return ResponseEntity.ok().body(pacienteRepository.findById(codigo));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		pacienteRepository.deleteById(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<Paciente> atualizar(@PathVariable Long codigo, @Valid @RequestBody Paciente paciente) {
		Paciente pacienteSalvo = pacienteService.atualizar(codigo, paciente);
		return ResponseEntity.ok(pacienteSalvo);
	}
}
