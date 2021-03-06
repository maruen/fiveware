package br.com.fiveware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private  Long idUsuario;
   
	@Column  private String  nome;
	@Column  private String  sexo;
	@Column  private String  perfil;
    @Column  private Integer ativo;

}
