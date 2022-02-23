package backend.futsal.Casa.Benfica.Portalegre.controllers;

import java.util.List;

import backend.futsal.Casa.Benfica.Portalegre.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import backend.futsal.Casa.Benfica.Portalegre.entities.Player;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

	ResponseEntity<Object> response;


	@RequestMapping("/players")
	public ResponseEntity<Object> getAllPlayers() {
		List<Player> listAllPlayer = playerService.getAllPlayers();
		if(listAllPlayer.isEmpty()){
			response = new ResponseEntity<>(listAllPlayer, HttpStatus.NO_CONTENT);
		}
		else{
			response = new ResponseEntity<>(listAllPlayer, HttpStatus.OK);
		}
		return response;
	}

	@RequestMapping("players/{id}")
	public ResponseEntity<Object> getPlayerById(@PathVariable long id){
		Player player = playerService.findPlayerById(id);
		if(player != null){
			response = new ResponseEntity<>(player, HttpStatus.OK);
		}
		else{
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

	@RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
	public ResponseEntity<Object> addPlayer(@RequestBody Player player){
		playerService.addPlayer(player);
		return new ResponseEntity<>(HttpStatus.CREATED);


	}
	@RequestMapping(value = "/updatePlayer", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePlayer(@RequestBody Player player){
		if(playerService.updatePlayer(player)){
			response = new ResponseEntity<>(HttpStatus.OK);
		}
		else{
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
	@RequestMapping(value = "/deletePlayer/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deletePlayerById(@PathVariable long id){
		if(playerService.deletePlayerById(id)){
			response = new ResponseEntity<>(HttpStatus.OK);
		}
		else{
			response = new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
