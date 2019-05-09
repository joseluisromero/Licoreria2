package com.licoreria.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.licoreria.entidad.Sucursal;

public interface SucursalRepositorio extends JpaRepository<Sucursal, Integer>{
@Query(value="Select * from sucursal  where sucur_estado=1", nativeQuery=true)
	public List<Sucursal> listaSucursalAtivos();
	
}
