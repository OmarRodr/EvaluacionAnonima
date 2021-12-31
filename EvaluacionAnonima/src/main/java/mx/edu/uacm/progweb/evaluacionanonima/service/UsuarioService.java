package mx.edu.uacm.progweb.evaluacionanonima.service;

import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;

public interface UsuarioService {
	Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, String contrasenia);
}
