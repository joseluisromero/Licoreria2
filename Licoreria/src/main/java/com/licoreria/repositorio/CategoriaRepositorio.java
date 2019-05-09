package com.licoreria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.licoreria.entidad.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

}
