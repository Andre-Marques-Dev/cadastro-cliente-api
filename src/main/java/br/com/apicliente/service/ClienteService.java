package br.com.apicliente.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apicliente.entity.Cliente;
import br.com.apicliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository; 
	
	public List<Cliente> listaTodosClientes(){
		
		return clienteRepository.findAll(); 
	}
	
	@Transactional
	public void inserir(Cliente cliente) {
		
		int id = 0;
		if(clienteRepository.buscarUltimoId() == null) {
			id = 1;
		}else {
			id = clienteRepository.buscarUltimoId() + 1;
		}
		cliente.setId(id);
		
		clienteRepository.save(cliente);
		
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}
	
	public void atualizar(Cliente cliente) {
		
		clienteRepository.save(cliente);
		
	}
	
}
