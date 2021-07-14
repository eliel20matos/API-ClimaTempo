package br.com.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eliel.domain.Anemometro;
import br.com.eliel.domain.Higrometro;

public interface HigrometroRepository extends JpaRepository<Higrometro, Long>{
	
	Anemometro findByUuid(String uuid);
	
	void deleteByUuid(String uuid);

}
