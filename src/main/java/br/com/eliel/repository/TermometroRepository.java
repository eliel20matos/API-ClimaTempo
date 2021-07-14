package br.com.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eliel.domain.Termometro;

public interface TermometroRepository extends JpaRepository<Termometro, Long>{

}
