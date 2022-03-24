package backend.futsal.Casa.Benfica.Portalegre.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import backend.futsal.Casa.Benfica.Portalegre.dto.PlayerDto;
import backend.futsal.Casa.Benfica.Portalegre.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import backend.futsal.Casa.Benfica.Portalegre.entities.Player;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

	ResponseEntity<Object> response;

	HttpHeaders responseHeaders = new HttpHeaders();



	@RequestMapping("/players")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<Object> getAllPlayers() {
		responseHeaders.set("Access-Control-Allow-Origin", "http://localhost:8080/players");;
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
		PlayerDto playerDto = playerService.findPlayerById(id);
		if(playerDto != null){
			response = new ResponseEntity<>(playerDto, HttpStatus.OK);
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
