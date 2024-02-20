package grupo3.fullstack.apuestas.services;

import java.util.ArrayList;

import grupo3.fullstack.apuestas.DTO.MatchDTO;

public interface MatchService {
	
	public ArrayList<MatchDTO> getMatches();
	public ArrayList<MatchDTO> getLiveMatches();
	
}
