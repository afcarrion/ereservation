package com.carricas.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carricas.ereservation.model.Cliente;

/**
 * Interface para definir las operaciones  de bdd relacionadas del cliente
 * @author freehyoga
 *
 */

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definicion de metodo para buscar clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	/**
	 * Definición de método para buscar un cliente por su identificación
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli);
	
	public List<Cliente> findAll();
}
