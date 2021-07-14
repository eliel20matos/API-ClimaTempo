package br.com.eliel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliel.domain.Pluviometro;
import br.com.eliel.domain.Termometro;
import br.com.eliel.repository.PluviometroRepository;

@RestController
@RequestMapping("/api/v1/precipitacao")
public class PluviometroResource {
	
	private List<Pluviometro> pluviometro = new ArrayList<>();
	
	@Autowired
	private PluviometroRepository pluviometroRepository;
	
	@PostMapping("/")
	public Pluviometro pluviometro(@RequestBody Pluviometro pluviometro) {
		return this.pluviometroRepository.save(pluviometro);
	}
	
	@GetMapping("/")
	public List<Pluviometro> getPrec () {
		return this.pluviometroRepository.findAll();
	}
	
	

}
