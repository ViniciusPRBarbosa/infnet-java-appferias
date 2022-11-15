package br.edu.infnet.appferias.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appferias.clients.IEnderecoClient;
import br.edu.infnet.appferias.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		
		return enderecoClient.obterPorCep(cep);
	}
}
