package com.cibertec.edu.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombres;
	private String apellidos;
	private int nro_documento;
	private int edad;
	private String fecha_pago;
	private String estado;
	
	public Usuario(int id, String nombres, String apellidos, int nro_documento, int edad, String fecha_pago,
			String estado) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nro_documento = nro_documento;
		this.edad = edad;
		this.fecha_pago = fecha_pago;
		this.estado = estado;
	}

	public Usuario() {
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(int nro_documento) {
		this.nro_documento = nro_documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
