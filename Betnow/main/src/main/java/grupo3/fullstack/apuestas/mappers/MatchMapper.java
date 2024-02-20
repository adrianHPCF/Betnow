package grupo3.fullstack.apuestas.mappers;

import java.util.List;

import org.mapstruct.Mapper;


import grupo3.fullstack.apuestas.DTO.MatchDTO;
import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;

@Mapper (componentModel = "spring", uses = {MatchMapper.class})
public interface MatchMapper {
	MatchDTO EntityToDTO (MatchEntity match);
	MatchEntity DTOToEntity(MatchDTO matchDTO);
	List<MatchDTO> listToDTO (List<MatchEntity> listaEntity);

}
