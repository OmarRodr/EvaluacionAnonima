package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String matricula;
	private int edad;
	
	public Persona() {
		super();
	}

	/*public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}*/
}
