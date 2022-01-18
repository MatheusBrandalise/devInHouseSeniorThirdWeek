package User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbUsers {

	private static List<User> allUsers() {
		List<User> usersList = new ArrayList<User>();
		
		User usuario1 = new User();
		usuario1.setFirstName("Matheus");
		usuario1.setLastName("Brandalise");
		usuario1.setBornDate(LocalDate.of(1994, 5, 15));
		usuario1.setCompleteAdress("Rua dos alfeneiros, 4 - Little Whinging");
		usersList.add(usuario1);
		
		User usuario2 = new User();
		usuario2.setFirstName("Ronan");
		usuario2.setLastName("Knob");
		usuario2.setBornDate(LocalDate.of(1993, 3, 26));
		usuario2.setCompleteAdress("Rua da Fiação, 200 - Londres");
		usersList.add(usuario2);
		
		User usuario3 = new User();
		usuario3.setFirstName("Maria");
		usuario3.setLastName("Clara");
		usuario3.setBornDate(LocalDate.of(1989, 6, 14));
		usuario3.setCompleteAdress("Rua da Fiação, 200 - Londres");
		usersList.add(usuario3);
		
		User usuario4 = new User();
		usuario4.setFirstName("Rafaela");
		usuario4.setLastName("Tedesco");
		usuario4.setBornDate(LocalDate.of(1993, 7, 7));
		usuario4.setCompleteAdress("Rua dos Dresch, 1520 - Florianópolis");
		usersList.add(usuario4);
		
		User usuario5 = new User();
		usuario5.setFirstName("Andre");
		usuario5.setLastName("Cogumelo");
		usuario5.setBornDate(LocalDate.of(2001, 8, 19));
		usuario5.setCompleteAdress("Rua Fifa, 525 - Palhoça");
		usersList.add(usuario5);

		return usersList;
	}
	
}
