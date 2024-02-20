package grupo3.fullstack.apuestas.services;

import java.util.ArrayList;
import java.util.List;

import grupo3.fullstack.apuestas.DTO.BetDTO;
import grupo3.fullstack.apuestas.persistence.entities.BetEntity;

public interface BetService {

	BetDTO createBet(BetDTO b);
	List<BetEntity> getMyBets();
	boolean deleteBet(Long id);
	
}
