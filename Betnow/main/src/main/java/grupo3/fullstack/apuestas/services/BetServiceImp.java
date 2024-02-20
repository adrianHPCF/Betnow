package grupo3.fullstack.apuestas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo3.fullstack.apuestas.DTO.BetDTO;
import grupo3.fullstack.apuestas.mappers.BetMapper;
import grupo3.fullstack.apuestas.mappers.MatchMapper;
import grupo3.fullstack.apuestas.mappers.UserMapper;
import grupo3.fullstack.apuestas.persistence.entities.BetEntity;
import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;
import grupo3.fullstack.apuestas.persistence.entities.UserEntity;
import grupo3.fullstack.apuestas.persistence.repositories.BetRepository;
import grupo3.fullstack.apuestas.persistence.repositories.MatchRepository;
import grupo3.fullstack.apuestas.persistence.repositories.UserRepository;
@Service
public class BetServiceImp implements BetService {
	@Autowired
	BetRepository br;
	@Autowired
	BetMapper bm;
	@Autowired
	UserMapper um;
	@Autowired
	UserRepository ur;
	@Autowired
	MatchMapper mm;
	@Autowired
	MatchRepository mr;
	
	@Override
	public BetDTO createBet(BetDTO b) {
		Long UserId = b.getUser_id();
		Long MatchId = b.getMatch_id();
		Optional<UserEntity> user = ur.findById(UserId);
		Optional<MatchEntity> match = mr.findById(MatchId);
		
		if (user.isPresent() && match.isPresent()) {
			BetEntity betEntity = bm.DTOToEntity(b);
			betEntity.setMatch(match.get());
			betEntity.setUser(user.get());
			br.save(betEntity);
			return bm.EntityToDTO(betEntity);
		}
		throw new RuntimeException("No es posible crear la apuesta, quizá no está registrado");
	}

	@Override
	public List<BetEntity> getMyBets() {
		
		return  br.findAll();
	}
 
	
 
	@Override
	public boolean deleteBet(Long id) {
		
		  if (br.existsById(id)) {
	           	br.deleteById(id);
	            return true;
	        }
	        return false;
		
	}
 
}
	

