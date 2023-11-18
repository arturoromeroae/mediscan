package com.cibertec.edu.Mediscan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cibertec.edu.Mediscan.models.BotData;
import com.cibertec.edu.Mediscan.services.BotDataService;

@RestController
@RequestMapping("/api/bot")
public class BotDataController {

	@Autowired
	private BotDataService service;
	
	@CrossOrigin(origins = "https://mediscan-99f31c760e05.herokuapp.com/api/bot")
	@GetMapping
	public List<BotData>listar(){
		return service.getAllBotData();
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<BotData>buscar(@PathVariable("id") Long id){
		return service.getBotDataById(id);
	}
	
	@PostMapping
	public void insertar(@RequestBody BotData data) {
		service.saveBotData(data);
	}
	
}
