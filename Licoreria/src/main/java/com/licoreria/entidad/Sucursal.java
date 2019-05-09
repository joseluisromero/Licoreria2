package com.licoreria.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="sucursal")
public class Sucursal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="sucur_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sucurId;
	
	
	@Column(name="sucur_nombre")
	private String sucurNombre;
	
	@Column(name="sucur_direccion")
	private String sucurDireccion;
	
	@Column(name="sucur_telefono")
	private String sucurTelefono;
	
	@Column(name="sucur_ruc")
	private String sucurRuc;
	
	@Column(name="sucur_estado")
	private Short sucurEstado;
	
	@Column(name="sucur_telef_local")
	private String sucurTelefLocal;
	
	@OneToMany(mappedBy="sucursal")
	private List<Empleado>empleadosList;
	
	public Sucursal() {
		
	}

	public Integer getSucurId() {
		return sucurId;
	}

	public void setSucurId(Integer sucurId) {
		this.sucurId = sucurId;
	}

	public String getSucurNombre() {
		return sucurNombre;
	}

	public void setSucurNombre(String sucurNombre) {
		this.sucurNombre = sucurNombre;
	}

	public String getSucurDireccion() {
		return sucurDireccion;
	}

	public void setSucurDireccion(String sucurDireccion) {
		this.sucurDireccion = sucurDireccion;
	}

	public String getSucurTelefono() {
		return sucurTelefono;
	}

	public void setSucurTelefono(String sucurTelefono) {
		this.sucurTelefono = sucurTelefono;
	}

	public String getSucurRuc() {
		return sucurRuc;
	}

	public void setSucurRuc(String sucurRuc) {
		this.sucurRuc = sucurRuc;
	}

	
	public Short getSucurEstado() {
		return sucurEstado;
	}

	public void setSucurEstado(Short sucurEstado) {
		this.sucurEstado = sucurEstado;
	}

	public String getSucurTelefLocal() {
		return sucurTelefLocal;
	}

	public void setSucurTelefLocal(String sucurTelefLocal) {
		this.sucurTelefLocal = sucurTelefLocal;
	}
	

	public List<Empleado> getEmpleadosList() {
		return empleadosList;
	}

	public void setEmpleadosList(List<Empleado> empleadosList) {
		this.empleadosList = empleadosList;
	}

	@Override
	public String toString() {
		return "Sucursal [sucurId=" + sucurId + ", sucurNombre=" + sucurNombre + ", sucurDireccion=" + sucurDireccion
				+ ", sucurTelefono=" + sucurTelefono + ", sucurRuc=" + sucurRuc + ", sucurEstado=" + sucurEstado
				+ ", sucurTelefLocal=" + sucurTelefLocal + ", empleadosList=" + empleadosList + "]";
	}

	
	
	

}
