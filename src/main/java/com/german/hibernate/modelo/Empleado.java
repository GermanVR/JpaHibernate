package com.german.hibernate.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_empleado")
	private Long codigo;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "fecha_nac")
	private Date fechaNacimiento;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Empleado() {
	}

	public Empleado(Long codigo, String apellido, String nombre, Date fechaNacimiento) {
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
