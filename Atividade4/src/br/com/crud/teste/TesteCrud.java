package br.com.crud.teste;
import br.com.crud.dao.ClienteDAO;

import br.com.crud.model.Cliente;


public class TesteCrud {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		// ------------ Cria um contato e salva no banco
		/*Cliente cliente = new Cliente();
		cliente.setNome("Maria Silva");
		cliente.setIdade(25);
		cliente.setCpf("12345687910");
		cliente.setEmail("maria.silva@gmail.com");
		
		clienteDAO.save(cliente);*/
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		/*Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Izadora");
		cliente.setIdade(25);
		cliente.setCpf("1234569872");
		cliente.setEmail("iza.santos@gmail.com");
		
		clienteDAO.update(cliente);*/
		
		// ------------ Remove o contato com id
		 /*clienteDAO.removeById(1);*/
		
		// ------------ Lista todos os contatos do banco de dados
		for (Cliente c : clienteDAO.getClientes()) {
			System.out.println("Nome: " + c.getNome()); 
		}
	}
}
