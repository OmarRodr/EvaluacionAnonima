package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Administrador extends Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String correoA;
	private String passwordA;
	
	public Administrador() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreoA() {
		return correoA;
	}

	public void setCorreoA(String correoA) {
		this.correoA = correoA;
	}

	public String getPasswordA() {
		return passwordA;
	}

	public void setPasswordA(String passwordA) {
		this.passwordA = passwordA;
	}
}
