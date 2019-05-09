package com.licoreria.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author manab
 *
 */
@Entity
@Table(name ="categoria")
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cat_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer catId;
	
	@Column(name="cat_nombre")
	private String catNombre;
	
	@Column(name="cat_descripcion")
	private String catDescripcion;
	
	@Column(name="cat_estado")
	private Short catEstado;
	
	public Categoria () {
		
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatNombre() {
		return catNombre;
	}

	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
	}

	public String getCatDescripcion() {
		return catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}

	public Short getCatEstado() {
		return catEstado;
	}

	public void setCatEstado(Short catEstado) {
		this.catEstado = catEstado;
	}

	@Override
	public String toString() {
		return "Categoria [catId=" + catId + ", catNombre=" + catNombre + ", catDescripcion=" + catDescripcion
				+ ", catEstado=" + catEstado + "]";
	}
	
	

}
