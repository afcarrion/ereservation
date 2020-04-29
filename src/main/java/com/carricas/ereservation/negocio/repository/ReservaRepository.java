/**
 * 
 */
package com.carricas.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.carricas.ereservation.model.Cliente;
import com.carricas.ereservation.model.Reserva;

/**
 * @author freehyoga
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String>{
	
	/**
	 * Método para consultar las reservas por cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Query("Select r from Reserva r where r.cliente =:cliente")
	public List<Reserva> findByCliente(Cliente cliente);
	
	@Query("Select r from Reserva r where r.fechaIngresoRes =:fechaInicio and r.fechaSalidaRes =:fechaSalida")
	public List<Reserva> find(@Param("fechaInicio") Date fechaInicio, @Param("fechaSalida")  Date fechaSalida);	
	
	/**
	 * Definición de método para buscar una reserva por su código
	 * @param codigoReserva
	 * @return
	 */
	public Reserva findByCodigoRes(String codigoReserva);
}
