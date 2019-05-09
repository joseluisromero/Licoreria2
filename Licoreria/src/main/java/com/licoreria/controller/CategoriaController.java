package com.licoreria.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.licoreria.entidad.Categoria;
import com.licoreria.interfaces.CategoriaServicio;

@Named(value="categoriaController")
@ViewScoped
public class CategoriaController implements Serializable{
	
	@Autowired CategoriaServicio categoriaServicio;
	
	private static final long serialVersionUID = 1L;
	private List<Categoria> listarCategoria;
	private Categoria categoria;

	
	
	@PostConstruct
	public void init() {
		categoria=new Categoria();
		listarCategoria=new ArrayList<>();
		listaCategoria();
	}
	 
public List<Categoria> listaCategoria(){
	listarCategoria=categoriaServicio.listar();
	return listarCategoria;
}

public void guardar(){
	if (categoria.getCatId()==null){
		if(categoria.getCatNombre()==null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Debe ingresar los campos",null));
			return;}
		categoria.setCatEstado(new Short("1"));
		categoriaServicio.crear(categoria);
		listaCategoria();
	} else {
		categoriaServicio.actualizar(categoria);
		listaCategoria();
	}
	
	
}

public void eliminar() {
	
	categoria.setCatEstado(new Short("0"));
	categoriaServicio.actualizar(categoria);
	listaCategoria();
}

 public void buscarId(Categoria id) {
	 System.out.println("id editar"+id);
	 categoria= categoriaServicio.buscar(id.getCatId());
 }

public List<Categoria> getListarCategoria() {
	return listarCategoria;
}

public void setListarCategoria(List<Categoria> listarCategoria) {
	this.listarCategoria = listarCategoria;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
 

		


}
