package br.com.fiveware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiveware.dao.UsuarioDAO;
import br.com.fiveware.model.Usuario;


@Service
public class UsuarioService {
    
	@Autowired private UsuarioDAO dao;
	
	public Usuario findByIdUsuario(Long idUsuario) {
		return dao.findByIdUsuario(idUsuario);
	}
	
   @Transactional
   public boolean save(Usuario user) {
       dao.save(user);
       return true;
   }
    
}
