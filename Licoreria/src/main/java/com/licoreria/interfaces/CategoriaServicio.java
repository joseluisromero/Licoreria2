package com.licoreria.interfaces;

import java.util.List;

import com.licoreria.entidad.Categoria;

public interface CategoriaServicio {
	public void eliminar(Categoria categoria);
	public void actualizar(Categoria categoria);
	public void crear (Categoria categoria);
	public Categoria buscar(Integer idBuscar);
	public List<Categoria> listar();
}
