package grupo3.fullstack.apuestas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import grupo3.fullstack.apuestas.DTO.BetDTO;
import grupo3.fullstack.apuestas.persistence.entities.BetEntity;
import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;
import grupo3.fullstack.apuestas.persistence.entities.UserEntity;



@Mapper (componentModel = "spring", uses = {BetMapper.class})
public interface BetMapper {
	@Mapping (source = "user", target="user_id", qualifiedByName = "mapUserId")
	@Mapping (source = "match", target="match_id", qualifiedByName ="mapMatchId")
	BetDTO EntityToDTO (BetEntity bet);
	BetEntity DTOToEntity(BetDTO betDTO);
	List<BetDTO> listToDTO (List<BetEntity> listaEntity);
	@Named("mapMatchID")
	default Long mapMatchId (MatchEntity match) {
			if (match == null) {
				return null;
			}
			return match.getMatch_id();
	}
	@Named("mapUserID")
	default Long mapUserId (UserEntity user) {
		if (user == null) {
			return null;
		}
		return user.getUser_id();
}
}
