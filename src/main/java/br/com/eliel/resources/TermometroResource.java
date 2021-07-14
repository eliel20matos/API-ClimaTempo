package br.com.eliel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.eliel.domain.Termometro;
import br.com.eliel.repository.TermometroRepository;

@RestController
@RequestMapping("/api/v1/temperatura")
public class TermometroResource {
	
	private List<Termometro> termometro = new ArrayList<>();
	
	@Autowired
	private TermometroRepository termometroRepository;
	
	@PostMapping("/")
	public Termometro termometro(@RequestBody Termometro termometro) {
		return this.termometroRepository.save(termometro);
	}
	
	@GetMapping("/")
	public List<Termometro> getTemp () {
		return this.termometroRepository.findAll();
	}
	
	

}
