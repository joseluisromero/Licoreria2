package com.licoreria.interfaces;

import java.util.List;

import com.licoreria.entidad.Sucursal;

public interface SucursalServicio {
	public void eliminar(Sucursal sucursal);
	public void actualizar(Sucursal sucursal);
	public void crear (Sucursal sucursal);
	public Sucursal buscar(Integer idBuscar);
	public List<Sucursal> listar();
	

}
