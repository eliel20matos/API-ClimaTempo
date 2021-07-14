package br.com.eliel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliel.domain.Higrometro;
import br.com.eliel.repository.HigrometroRepository;

@RestController
@RequestMapping("/api/v1/umidade-relativa")
public class HigrometroResource {
	
	private List<Higrometro> higrometro = new ArrayList<>();
	
	@Autowired
	private HigrometroRepository higrometroRepository;
	
	@PostMapping("/")
	public Higrometro higrometro(@RequestBody Higrometro higrometro) {
		return this.higrometroRepository.save(higrometro);
	}
	
	@GetMapping("/")
	public List<Higrometro> getPrec () {
		return this.higrometroRepository.findAll();
	}
	
	

}
