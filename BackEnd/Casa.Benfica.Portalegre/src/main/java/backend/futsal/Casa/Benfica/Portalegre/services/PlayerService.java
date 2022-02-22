package backend.futsal.Casa.Benfica.Portalegre.services;



import backend.futsal.Casa.Benfica.Portalegre.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.futsal.Casa.Benfica.Portalegre.repositories.PlayerRepository;

import java.util.ArrayList;
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
        playerRepository.save(player);
    }

    public void updatePlayer(Player player){
        playerRepository.save(player);
    }
    public Player getPlayer(int id){
        Optional<Player> optPlayer = playerRepository.findById(id);
        return optPlayer.orElse(null);
    }

    public void deletePlayerById(int id) {
        playerRepository.deleteById(id);
    }
}
