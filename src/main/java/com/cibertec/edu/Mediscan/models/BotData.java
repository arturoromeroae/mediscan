package com.cibertec.edu.Mediscan.models;

import java.io.Serializable;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="bot_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BotData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String message;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
	private Usuario user;
	
	private LocalTime createAt;
}
