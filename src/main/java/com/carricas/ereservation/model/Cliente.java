/**
 * 
 */
package com.carricas.ereservation.model;

import lombok.Data;

/**
 * Clase que representa la tabla cliente
 * @author freehyoga
 *
 */
@Data
public class Cliente {
	private String nombreCli;
	private String apellidoCli;
	
	public Cliente() {
		
	}
}
