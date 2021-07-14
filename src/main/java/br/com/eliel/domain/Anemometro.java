package br.com.eliel.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Anemometro {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O valor do vento deve ser preenchido!")
	private String veloVento;
	
	@NotNull(message = "A data deve ser preenchido!")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date registroData;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("uuid")
	@Column(name = "ext_uuid", 
	        updatable = false, 
	        columnDefinition = "varchar(36) not null")
    private String uuid;
	
	
	public Anemometro() {
		UUID uuid_ = UUID.randomUUID();
		this.uuid = uuid_.toString(); 
	}
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getVeloVento() {
		return veloVento;
	}

	public void setVeloVento(String veloVento) {
		this.veloVento = veloVento;
	}

	public Date getRegistroData() {
		return registroData;
	}

	public void setRegistroData(Date registroData) {
		this.registroData = registroData;
	}

	public String getUuid() {
		return uuid;
	}
	
	
}
