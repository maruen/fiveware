package br.com.fiveware.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.fiveware.model.Usuario;
import br.com.fiveware.repository.UsuarioRepository;

@Repository
public class UsuarioDAO {
    
	@Autowired UsuarioRepository repository;

	public Usuario findByIdUsuario(Long idUsuario) {
        return repository.findByIdUsuario(idUsuario);
    }
	
    public void save(Usuario user) {
        repository.save(user);
    }
    
   
    
}
