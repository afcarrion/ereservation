/**
 * 
 */
package com.carricas.ereservation.negocio.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carricas.ereservation.model.Reserva;
import com.carricas.ereservation.negocio.repository.ReservaRepository;

/**
 * @author freehyoga
 *
 */
@Service
@Transactional(readOnly = true)
public class ReservaService {
	
	private final ReservaRepository reservaReporitory;
	
	public ReservaService(ReservaRepository reservaRepository) {
		this.reservaReporitory = reservaRepository;
	}
	@Transactional
	public Reserva create(Reserva reserva) {
		return this.reservaReporitory.save(reserva);
	}
	/**
	 * Actualizar reserva con ID especificado
	 * @param reserva
	 * @return Reserva
	 */
	@Transactional
	public Reserva update(Reserva reserva) {
		return this.reservaReporitory.save(reserva);
	}
	@Transactional
	public void delete(Reserva reserva){
		this.reservaReporitory.delete(reserva);
	}
	
	public List<Reserva> find(Date fechaInicio, Date fechaSalida) {
		return this.reservaReporitory.find(fechaInicio, fechaSalida);
	}
	

}
