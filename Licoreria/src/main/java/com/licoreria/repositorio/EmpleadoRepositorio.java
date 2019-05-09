package com.licoreria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.licoreria.entidad.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{

}
