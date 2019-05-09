package com.licoreria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.licoreria.entidad.Categoria;
import com.licoreria.interfaces.CategoriaServicio;
import com.licoreria.repositorio.CategoriaRepositorio;
@Service
public class CategoriaServicioImpl implements  CategoriaServicio {
	
	@Autowired CategoriaRepositorio categoriaRepositorio;
	
	@Override
	public void eliminar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepositorio.save(categoria);
	}

	@Override
	public void actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepositorio.save(categoria);
	}

	@Override
	public void crear(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepositorio.save(categoria);
	}

	@Override
	public Categoria buscar(Integer idBuscar) {
		// TODO Auto-generated method stub
		return categoriaRepositorio.getOne(idBuscar);
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return categoriaRepositorio.findAll();
	}

}
