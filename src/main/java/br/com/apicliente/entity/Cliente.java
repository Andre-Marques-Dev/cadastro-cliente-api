package br.com.apicliente.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "cliente")
public class Cliente {

	@Id
	private Integer id;
	
	@Column(name = "nome")
	private String nomeCliente;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date nascimento;
	
	private String endereco;
	
}
