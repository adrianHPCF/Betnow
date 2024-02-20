package grupo3.fullstack.apuestas.mappers;

import java.util.List;

import org.mapstruct.Mapper;


import grupo3.fullstack.apuestas.DTO.UserDTO;

import grupo3.fullstack.apuestas.persistence.entities.UserEntity;

@Mapper (componentModel = "spring", uses = {UserMapper.class})
public interface UserMapper {
	UserDTO EntityToDTO (UserEntity user);
	UserEntity DTOToEntity(UserDTO userDTO);
	List<UserDTO> listToDTO (List<UserEntity> listaEntity);
}
