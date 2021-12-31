package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario extends Persona  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String correoU;
	private String passwordU;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
		
	public Usuario(String correo,  String password){
		this.passwordU = password;
		this.correoU  = correo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreoU() {
		return correoU;
	}

	public void setCorreoU(String correoU) {
		this.correoU = correoU;
	}

	public String getPasswordU() {
		return passwordU;
	}

	public void setPasswordU(String passwordU) {
		this.passwordU = passwordU;
	}
		
}
