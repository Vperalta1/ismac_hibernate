package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Cliente;

public interface ClienteDAO {

	//CRUD: Create,Read,Update,Delete
	///      ADD  findSelect	Up	del
	public List <Cliente> findALL();
	
	public Cliente findOne();
	
	public void add(Cliente cliente);
	
	public void up(Cliente cliente);
	
	public void del(int id);
}