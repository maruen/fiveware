package br.com.fiveware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiveware.model.Usuario;
import br.com.fiveware.service.UsuarioService;


@RestController
public class UsuarioController {
    
	@Autowired private UsuarioService usuarioService;
    
    
    @RequestMapping(value  = "/usuario/save", method = RequestMethod.POST)
    public String save(@RequestBody LinkedMultiValueMap<String,String> data) {
      
    	Usuario usuario = new Usuario();
    	usuario.setNome(data.get("nome").get(0));
    	usuario.setSexo(data.get("sexo").get(0));
    	usuario.setPerfil(data.get("perfil").get(0));
    	
    	if (data.get("ativo").get(0).equals("true") ) {
    		usuario.setAtivo(1);
    	} else {
    		usuario.setAtivo(0);
    	}
    	
    	
    	Boolean result = usuarioService.save(usuario);
    	
    	if (result == true) {
    		return "success";
    	} 
    	
    	return "error";
    
    }
    
   
    
    
    
    
    
}
