package br.edu.infnet.appferias.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IUsuarioClient;
import br.edu.infnet.appferias.model.domain.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioClient usuarioClient;
	
	public void incluir(Usuario turista) {
		usuarioClient.incluir(turista);
	}

	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioClient.obterLista();
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioClient.validar(email, senha);
		
		if(usuario != null)
			return usuario;
		
		return null;
	}
}
