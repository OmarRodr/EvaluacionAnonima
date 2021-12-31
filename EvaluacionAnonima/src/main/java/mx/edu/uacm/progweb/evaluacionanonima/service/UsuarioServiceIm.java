package mx.edu.uacm.progweb.evaluacionanonima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;
import mx.edu.uacm.progweb.evaluacionanonima.repository.UsuarioRepository;



@Service
@Slf4j
public class UsuarioServiceIm implements UsuarioService{

	@Override
	public Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}*/
    
   
	
	/*@Override
	public Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, String contrasenia) {
		if(log.isDebugEnabled())
			log.debug("> Entrando a UsuarioServiceImpl.obtenerUsuarioPorCorreoYContrasenia()");
		
		//--> incorrecto contrasenia = passwordEncoder.encode(contrasenia);
		//Usuario usuarioRecuperado = usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
		

		Usuario usuarioRecuperado = usuarioRepository.findByCorreo(correo);
		
		log.debug("usuario recuperado: " + usuarioRecuperado);
		
		if(usuarioRecuperado != null && passwordEncoder.matches(contrasenia, usuarioRecuperado.getPasswordU())) {
			
			return usuarioRecuperado;
		} else {
			
			return null;
		}
	}*/

}
