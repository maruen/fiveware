package br.com.fiveware.repository;

import br.com.fiveware.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
	Usuario findByIdUsuario(Long idUsuario);
    
}
