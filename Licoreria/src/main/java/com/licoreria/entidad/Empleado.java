/**
 * 
 */
package com.licoreria.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author manab
 *
 */
@Table(name="empleado")
@Entity
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	
	@Column(name="emp_nombre")
	private String empNombre;
	
	@Column(name="emp_apellido")
	private String empApellido;
	
	@Column(name="emp_telefono")
	private String empTelefono;
	
	@Column(name="emp_direccion")
	private String empDireccion;
	
	@Column(name="emp_correo")
	private String empCorreo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="emp_fecha_nacimiento")
	private Date empFechaNacimiento;
	
	@Column(name="emp_estado")
	private Short empEstado;
	
	@ManyToOne
	@JoinColumn(name="sucur_id",referencedColumnName="sucur_id")
	private Sucursal sucursal;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpNombre() {
		return empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpApellido() {
		return empApellido;
	}

	public void setEmpApellido(String empApellido) {
		this.empApellido = empApellido;
	}

	public String getEmpTelefono() {
		return empTelefono;
	}

	public void setEmpTelefono(String empTelefono) {
		this.empTelefono = empTelefono;
	}

	public String getEmpDireccion() {
		return empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpCorreo() {
		return empCorreo;
	}

	public void setEmpCorreo(String empCorreo) {
		this.empCorreo = empCorreo;
	}

	public Date getEmpFechaNacimiento() {
		return empFechaNacimiento;
	}

	public void setEmpFechaNacimiento(Date empFechaNacimiento) {
		this.empFechaNacimiento = empFechaNacimiento;
	}

	public Short getEmpEstado() {
		return empEstado;
	}

	public void setEmpEstado(Short empEstado) {
		this.empEstado = empEstado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Empleado [empId=" + empId + ", empNombre=" + empNombre + ", empApellido=" + empApellido
				+ ", empTelefono=" + empTelefono + ", empDireccion=" + empDireccion + ", empCorreo=" + empCorreo
				+ ", empFechaNacimiento=" + empFechaNacimiento + ", empEstado=" + empEstado + ", sucursal=" + sucursal
				+ "]";
	}
	
	
	

}
