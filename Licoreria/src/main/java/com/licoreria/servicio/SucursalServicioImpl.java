package com.licoreria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.licoreria.entidad.Sucursal;
import com.licoreria.interfaces.SucursalServicio;
import com.licoreria.repositorio.SucursalRepositorio;

@Service
public class SucursalServicioImpl implements SucursalServicio{
@Autowired SucursalRepositorio sucursalRepositorio;
	
	@Override
	public void eliminar(Sucursal sucursal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Sucursal sucursal) {
		// TODO Auto-generated method stub
		sucursalRepositorio.save(sucursal);
	}

	@Override
	public void crear(Sucursal sucursal) {
		// TODO Auto-generated method stub
		sucursalRepositorio.save(sucursal);
	}

	@Override
	public Sucursal buscar(Integer idBuscar) {
		// TODO Auto-generated method stub
		
		return sucursalRepositorio.getOne(idBuscar);
	}

	@Override
	public List<Sucursal> listar() {
		// TODO Auto-generated method stub
		
		return sucursalRepositorio.listaSucursalAtivos();
	}

}
