/**
 * 
 */
package com.carricas.ereservation.negocio.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carricas.ereservation.model.Cliente;
import com.carricas.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase definida para implementar servicios del negocio referente al cliente.
 * 
 * @author freehyoga
 *
 */

@Service
@Transactional(readOnly = true)
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo para actualizar cliente. Se utiliza save debido a que el objeto ya debe entrar con ID 
	 * y este actalizara los demas valores.
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	/**
	 * Metodo para eliminar un cliente
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	/**
	 * Metodo para consultar cliente identificacion.
	 * @param identificacion
	 * @return
	 */
	public Cliente finByIdentificacion(String identificacion) {
		return this.clienteRepository.findByIdentificacion(identificacion);
	}
}
