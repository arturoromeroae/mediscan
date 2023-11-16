package com.cibertec.edu.Mediscan.models;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombres;
	private String apellidos;
	private String correo;
	private String contraseña;
	private String idCompra;
	
	private String fecha_pago;
	private String estado;
	
	@OneToMany(mappedBy="user")
	private Set<BotData>botData;
}
