package backend.futsal.Casa.Benfica.Portalegre.controllers;

import java.util.List;

import backend.futsal.Casa.Benfica.Portalegre.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import backend.futsal.Casa.Benfica.Portalegre.entities.Player;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;


	@RequestMapping("/players")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	@RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
	public void addPlayer(@RequestBody Player player){
		playerService.addPlayer(player);
	}
	@RequestMapping(value = "/updatePlayer", method = RequestMethod.PUT)
	public void updatePlayer(@RequestBody Player player){
		playerService.updatePlayer(player);
	}
	@RequestMapping(value = "/deletePlayer/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable int id){
		playerService.deletePlayerById(id);
	}

}
