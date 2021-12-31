package mx.edu.uacm.progweb.evaluacionanonima.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;
import mx.edu.uacm.progweb.evaluacionanonima.service.*;

@Controller
@RequestMapping("/inicio")
@Slf4j
public class InicioController {
	
	/*@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private HttpSession httpSession;*/
	
	private ServletContext servletContext;
	
	public InicioController(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	
	@PostMapping("/inicioPcp")
	public String inicioPrincipaal() {
		return "redirect:/";
	}
	
	@PostMapping("/adminCtlg")
	public String adminCatalogoo() {
		return "redirect:/catalogoAdmin";
	}
	
	@PostMapping("/creaActividadd")
	public String creaActividad() {
		return "redirect:/creaActivity";
	}
	
	@PostMapping("/iniSesion")
	public String inicioSesion() {
		return "redirect:/inicioSesion";
	}
	
	@PostMapping("/registroPersona")
	public String registroDePersona() {
		return "redirect:/registrarse";
	}
	
	/*@PostMapping("/login")
	public String iniciarSesion(@RequestParam("correo") String correo, @RequestParam("contrasenia") String password,
			Model model) {
		
		if(log.isDebugEnabled())
			log.debug("> Entrando al metodo iniciarSesion <");
		
		Usuario usuario = usuarioService.obtenerUsuarioPorCorreoYContrasenia(correo, password);
		
		if(usuario != null) {
			
			httpSession.setAttribute("usuarioLogueado", usuario);
			
		} else {
			
			//Si algo va mal te regresa a la misma vista login y te regresa el  fragmento cuyo id es contenedor html 
			servletContext.setAttribute("errorMensaje", "Usuario/Contrasenia no validos");
			//model.addAttribute("errorMensaje", "Usuario/Contrasenia no validos");
			//model.addAttribute("correoRecibido", correo);
			//return "login::#contenedor";
			return "redirect:/inicioSesion";
		}
		
		String[] aux = usuario.getCorreoU().split("@");
		if(aux[1] == "admi.com") {
			return "redirect:/admiInicio";
		}else {
			return "redirect:/inicioUser";
		}
		//si fue exitoso te redirecciona a la vista home con el atributo en sesion llamado usuarioLogueado
		
	}*/
	
}
