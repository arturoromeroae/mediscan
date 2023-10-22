package com.cibertec.edu.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	Long id;
	
	@Column(name = "user_nombres")
	String nombres;
	
	@Column(name = "user_apellidos")
	String apellidos;
	
	@Column(name = "user_nro_documento")
	int nro_documento;
	
	@Column(name = "user_edad")
	int edad;
	
	@Column(name = "user_fecha_pago")
	String fecha_pago;
	
	@Column(name = "user_estado")
	String estado;
}
