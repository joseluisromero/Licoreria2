package com.licoreria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.licoreria.entidad.Empleado;
import com.licoreria.interfaces.EmpleadoServicio;
import com.licoreria.repositorio.EmpleadoRepositorio;
@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {
	@Autowired EmpleadoRepositorio empleadoRepositorio;
	@Override
	public void eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.save(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.save(empleado);
	}

	@Override
	public void crear(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.save(empleado);
	}

	@Override
	public Empleado buscar(Integer idBuscar) {
		// TODO Auto-generated method stub
		return empleadoRepositorio.getOne(idBuscar);
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return empleadoRepositorio.findAll();
	}

}
