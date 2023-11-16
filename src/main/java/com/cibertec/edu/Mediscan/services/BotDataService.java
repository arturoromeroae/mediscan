package com.cibertec.edu.Mediscan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cibertec.edu.Mediscan.models.BotData;
import com.cibertec.edu.Mediscan.repositories.IBotDataRepository;

@Service
public class BotDataService{

	@Autowired
	private IBotDataRepository botDataRepository;
	
	public void saveBotData(BotData botData) {
		botDataRepository.save(botData);
	}
	
	public ResponseEntity<BotData> getBotDataById(Long id) {
		return botDataRepository.findById(id)
				.map(ResponseEntity::ok)
	            .orElse(ResponseEntity.notFound().build());
	}
	public List<BotData>getAllBotData(){
		return botDataRepository.findAll();
	}
}
