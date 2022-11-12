package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appferias.model.domain.Usuario;
import br.edu.infnet.appferias.model.repository.UsuarioRepository;

@SessionAttributes("user")
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void incluir(Usuario turista) {
		usuarioRepository.save(turista);
	}

	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			
			return usuario;
		}
		
		return null;
	}
}
