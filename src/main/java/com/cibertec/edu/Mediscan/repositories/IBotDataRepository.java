package com.cibertec.edu.Mediscan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.edu.Mediscan.models.BotData;

public interface IBotDataRepository extends JpaRepository<BotData, Long> {

}
