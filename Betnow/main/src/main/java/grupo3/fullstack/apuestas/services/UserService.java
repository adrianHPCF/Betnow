package grupo3.fullstack.apuestas.services;

import grupo3.fullstack.apuestas.DTO.UserDTO;

public interface UserService {

	void createUser(UserDTO u);
	void depositCash (UserDTO u);
	void withdrawCash (UserDTO u);

/*	Funciones posibles proximas: 
		borrar usuario
		cambiar/recuperar contraseñas
	*/
}
