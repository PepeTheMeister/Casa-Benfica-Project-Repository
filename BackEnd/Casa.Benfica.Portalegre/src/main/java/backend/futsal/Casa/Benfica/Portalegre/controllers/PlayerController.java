package backend.futsal.Casa.Benfica.Portalegre.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.futsal.Casa.Benfica.Portalegre.entities.Player;

@RestController
public class PlayerController {
	
	
	@RequestMapping()
	public List<Player> getAllPlayers() {
		
		
		return null;
	}

}
