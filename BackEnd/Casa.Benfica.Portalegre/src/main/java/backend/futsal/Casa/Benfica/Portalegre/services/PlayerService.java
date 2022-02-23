package backend.futsal.Casa.Benfica.Portalegre.services;



import backend.futsal.Casa.Benfica.Portalegre.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.futsal.Casa.Benfica.Portalegre.repositories.PlayerRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        List<Player> allplayers = new ArrayList<>();
        playerRepository.findAll().forEach(allplayers::add);
        return allplayers;
    }


    public void addPlayer(Player player) {
        player.setLastModify(new Date(System.currentTimeMillis()));
        playerRepository.save(player);
    }

    public boolean updatePlayer(Player player){
        if(playerRepository.existsById(player.getId())){
            playerRepository.save(player);
            return true;
        }
        else{
            return false;
        }

    }
    public Player findPlayerById(long id){
        Optional<Player> optPlayer = playerRepository.findById(id);
        return optPlayer.orElse(null);
    }

    public boolean deletePlayerById(long id) {
        if(playerRepository.existsById(id)){
            playerRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }

    }
}
