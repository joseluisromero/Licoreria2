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

import com.licoreria.entidad.Sucursal;
import com.licoreria.interfaces.SucursalServicio;

@Named(value="sucursalController")
@ViewScoped
public class SucursalController implements Serializable{
	
	@Autowired SucursalServicio sucursalServicio;
	
	private static final long serialVersionUID = 1L;
	private List<Sucursal> listarSucursal;
	private Sucursal sucursal;

	
	
	@PostConstruct
	public void init() {
		sucursal=new Sucursal();
		listarSucursal=new ArrayList<>();
		listaSucursal();
	}
	 
public List<Sucursal> listaSucursal(){
	listarSucursal=sucursalServicio.listar();
	return listarSucursal;
}

public void guardar(){
	if (sucursal.getSucurId()==null){
		if(sucursal.getSucurNombre()==null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Debe ingresar los campos",null));
			return;}
		sucursal.setSucurEstado(new Short("1"));
		sucursalServicio.crear(sucursal);
		listaSucursal();
	} else {
		sucursalServicio.actualizar(sucursal);
		listaSucursal();
	}
	
	
}

public void eliminar() {
	
	sucursal.setSucurEstado(new Short("0"));
	sucursalServicio.actualizar(sucursal);
	listaSucursal();
}

 public void buscar(Integer id) {
	 System.out.println("llego buscar sucursal"+id);
	 sucursal= sucursalServicio.buscar(id);
 }
 

public Sucursal getSucursal() {
	return sucursal;
}

public void setSucursal(Sucursal sucursal) {
	this.sucursal = sucursal;
}

public List<Sucursal> getListarSucursal() {
	return listarSucursal;
}

public void setListarSucursal(List<Sucursal> listarSucursal) {
	this.listarSucursal = listarSucursal;
}


}
