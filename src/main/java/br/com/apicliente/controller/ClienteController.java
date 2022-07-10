package br.com.apicliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apicliente.entity.Cliente;
import br.com.apicliente.service.ClienteService;

@RestController
@CrossOrigin(value = "*")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listaTodosClientes(){
		return clienteService.listaTodosClientes(); 
	}
	
	@PostMapping("/clientes")
	public void inserir(@RequestBody Cliente cliente) {
		clienteService.inserir(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void excluir(@PathVariable Integer id) {
		clienteService.excluir(id);
	}
	
	@PutMapping("/clientes")
	public void atualizar(@RequestBody Cliente cliente) {
		clienteService.atualizar(cliente);
	}
	
}
