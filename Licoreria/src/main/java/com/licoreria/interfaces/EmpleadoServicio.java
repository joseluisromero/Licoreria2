package com.licoreria.interfaces;

import java.util.List;

import com.licoreria.entidad.Empleado;


public interface EmpleadoServicio {
	public void eliminar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void crear (Empleado empleado);
	public Empleado buscar(Integer idBuscar);
	public List<Empleado> listar();
}
