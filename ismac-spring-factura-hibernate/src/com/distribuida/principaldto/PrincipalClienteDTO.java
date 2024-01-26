package com.distribuida.principaldto;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalClienteDTO {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	ClienteService clienteService = context.getBean("clienteServiceImpl",ClienteService.class);
	
	
	//CRUD
	
	//ADD
	Cliente cliente =new Cliente(0,"1755378385","Jose","Mena",11,new Date(),"Calderon","0968241486","jm@gmail.com");
	//clienteService.add(cliente);
	
	//UP
	Cliente cliente1 =new Cliente(33,"1755378385","Jose","Mena",11,new Date(),"Calderon","0968241486","jm@gmail.com");
	//clienteService.up(cliente1);
	
	//	DEL
	
	//ClienteService.del(31);
	
	//findAll
	List<Cliente> clientes = clienteService.findAll();
	
	
	
	
	//impresion
	for (Cliente item : clientes) {
		System.out.println(item.toString());
	}
	
	//findOne
	//Clientes cliente =clienteService.findOne(3);
	
	//System.out.println(cliente.toString());
	
	context.close();
}
}
