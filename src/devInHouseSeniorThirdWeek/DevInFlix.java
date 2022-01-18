package devInHouseSeniorThirdWeek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Movie.*;
import Recomendation.*;
import Suggestion.*;
import User.*;

public class DevInFlix {

	public static void main(String[] args) {
		List<User> usersList = new ArrayList<User>();
		List<Movie> movieList = new ArrayList<Movie>();

		/*--- CRIA FILMES ---*/
		Movie movie1 = new Movie();
		movie1.setName("Shang-Chi e a Lenda dos Dez Anéis");
		movie1.setSynopsis(
				"Shang-Chi é obrigado a confrontar um passado que julgava ter deixado para trás quando é atraído à teia da misteriosa organização conhecida como os Dez Anéis.");
		movie1.setGenre(MovieGenre.ACAO);
		movie1.setLink("https://www.imdb.com/title/tt9376612/?ref_=hm_tpks_tt_t_13_pd_tp1_cp");
		movieList.add(movie1);

		Movie movie2 = new Movie();
		movie2.setName("Duna");
		movie2.setSynopsis(
				"Adaptação do romance de ficção científica de Frank Herbert, sobre o filho de uma família nobre encarregada de proteger um planeta temperado.");
		movie2.setGenre(MovieGenre.DRAMA);
		movie2.setLink("https://www.imdb.com/title/tt1160419/?ref_=hm_fanfav_tt_i_7_pd_fp1");
		movieList.add(movie2);

		Movie movie3 = new Movie();
		movie3.setName("Luca");
		movie3.setSynopsis(
				"Na Riviera italiana, uma amizade tão forte quanto inesperada surge entre um ser humano e um monstro marinho camuflado.");
		movie3.setGenre(MovieGenre.ANIMACAO);
		movie3.setLink("https://www.imdb.com/title/tt12801262/?ref_=hm_tpks_tt_i_19_pd_tp1_cp");
		movieList.add(movie3);

		Movie movie4 = new Movie();
		movie4.setName("Encanto");
		movie4.setSynopsis(
				"Na Colômbia, uma jovem lida com a frustração de ser o único membro da família que não tem poderes mágicos.");
		movie4.setGenre(MovieGenre.ANIMACAO);
		movie4.setLink("https://www.imdb.com/title/tt2953050/?ref_=hm_fanfav_tt_i_3_pd_fp1");
		movieList.add(movie4);

		Movie movie5 = new Movie();
		movie5.setName("Raya e o Último Dragão");
		movie5.setSynopsis(
				"Em um reino conhecido como Lumandra, uma Terra reinventada e habitada por uma civilização antiga, um guerreiro chamado Raya está determinado a encontrar o último dragão.");
		movie5.setGenre(MovieGenre.ANIMACAO);
		movie5.setLink("https://www.imdb.com/title/tt5109280/?ref_=tt_sims_tt_i_3");
		movieList.add(movie5);

		Movie movie6 = new Movie();
		movie6.setName("Cruella");
		movie6.setSynopsis("Uma prequela sobre a vida da jovem Cruella de Vil.");
		movie6.setIdGenre(1);
		;
		movie6.setLink("https://www.imdb.com/title/tt3228774/?ref_=hm_tpks_tt_i_7_pd_tp1_cp");
		movieList.add(movie6);

		/*--- CRIA USUARIOS ---*/
		User user1 = new User();
		user1.setFirstName("Matheus");
		user1.setLastName("Brandalise");
		user1.setBornDate(LocalDate.of(1994, 5, 15));
		user1.setCompleteAdress("Rua dos alfeneiros, 4 - Little Whinging");
		user1.setPaymentSituation(true);
		usersList.add(user1);

		User user2 = new User();
		user2.setFirstName("Ronan");
		user2.setLastName("Knob");
		user2.setBornDate(LocalDate.of(1993, 3, 26));
		user2.setCompleteAdress("Rua da Fiação, 200 - Londres");
		user2.setPaymentSituation(true);
		usersList.add(user2);

		User user3 = new User();
		user3.setFirstName("Maria");
		user3.setLastName("Clara");
		user3.setBornDate(LocalDate.of(1989, 6, 14));
		user3.setCompleteAdress("Rua da Fiação, 200 - Londres");
		user3.setPaymentSituation(true);
		usersList.add(user3);

		User user4 = new User();
		user4.setFirstName("Rafaela");
		user4.setLastName("Tedesco");
		user4.setBornDate(LocalDate.of(1993, 7, 7));
		user4.setCompleteAdress("Rua dos Dresch, 1520 - Florianópolis");
		user4.setPaymentSituation(true);
		usersList.add(user4);

		User user5 = new User();
		user5.setFirstName("Andre");
		user5.setLastName("Cogumelo");
		user5.setBornDate(LocalDate.of(2001, 8, 19));
		user5.setCompleteAdress("Rua Fifa, 525 - Palhoça");
		user5.setPaymentSituation(false);
		usersList.add(user5);

		User user6 = new User();
		user6.setFirstName("Taianá");
		user6.setLastName("Castanha");
		user6.setBornDate(LocalDate.of(2002, 8, 28));
		user6.setCompleteAdress("Rua PES, 987 - Palhoça");
		user6.setPaymentSituation(false);
		usersList.add(user6);

		User user7 = new User();
		user7.setFirstName("Andreia");
		user7.setLastName("Miamar");
		user7.setBornDate(LocalDate.of(2000, 5, 19));
		user7.setCompleteAdress("Rua GOW, 1400 - Campinas");
		user7.setPaymentSituation(false);
		usersList.add(user7);

		User user8 = new User();
		user8.setFirstName("Mariana");
		user8.setLastName("Pimenta");
		user8.setBornDate(LocalDate.of(1989, 7, 14));
		user8.setCompleteAdress("Rua do Assaltos, 1525 - São Paulo");
		user8.setPaymentSituation(false);
		usersList.add(user8);

		User user9 = new User();
		user5.setFirstName("Carolina");
		user5.setLastName("Jabuticaba");
		user5.setBornDate(LocalDate.of(1990, 3, 21));
		user5.setCompleteAdress("Rua das Laranjeiras, 12 - Rio de Janeiro");
		user5.setPaymentSituation(true);
		usersList.add(user9);

		User user10 = new User();
		user10.setFirstName("Karoline");
		user10.setLastName("Angela");
		user10.setBornDate(LocalDate.of(1988, 7, 03));
		user10.setCompleteAdress("Rua Figueira, 5 - Taió");
		user10.setPaymentSituation(true);
		usersList.add(user10);

		User user11 = new User();
		user11.setFirstName("Roseneide");
		user11.setLastName("Ferreira");
		user11.setBornDate(LocalDate.of(1987, 1, 22));
		user11.setCompleteAdress("Rua das Castanheiras, 25 - Marilia");
		user11.setPaymentSituation(false);
		usersList.add(user11);

		User user12 = new User();
		user12.setFirstName("Miranda");
		user12.setLastName("Prisley");
		user12.setBornDate(LocalDate.of(1967, 10, 14));
		user12.setCompleteAdress("Strawbery Street, 1752 - Nova York");
		user12.setPaymentSituation(true);
		usersList.add(user12);

		User user13 = new User();
		user13.setFirstName("Amanda");
		user13.setLastName("Paython");
		user13.setBornDate(LocalDate.of(2004, 1, 19));
		user13.setCompleteAdress("Watermelon Street, 12 - Toronto");
		user13.setPaymentSituation(true);
		usersList.add(user13);

		User user14 = new User();
		user14.setFirstName("Lebron");
		user14.setLastName("Curry");
		user14.setBornDate(LocalDate.of(1979, 7, 12));
		user14.setCompleteAdress("Basket Street, 2240 - Miami");
		user14.setPaymentSituation(true);
		usersList.add(user14);

		User user15 = new User();
		user15.setFirstName("Stephen");
		user15.setLastName("James");
		user15.setBornDate(LocalDate.of(1981, 6, 30));
		user15.setCompleteAdress("Airball Avenue, 3801 - Menphis");
		user15.setPaymentSituation(false);
		usersList.add(user15);

		/*--- CRIA SUGESTÕES DE FILMES ---*/
		Suggestion suggestion1 = new Suggestion("Miranha novo.", user1);
		Suggestion suggestion2 = new Suggestion("Eternals", user2);
		Suggestion suggestion3 = new Suggestion("Matrix 5", user3);
		Suggestion suggestion4 = new Suggestion("Velozes e Furios 23", user4);
		Suggestion suggestion5 = new Suggestion("Aquele que o Toreto vai pro espaço de carro.", user5);

		/*--- USUÁRIOS FAZEM AVALIAÇÕES DE FILMES ---*/
		movie2.setAvaliation(user2, true);
		movie2.setAvaliation(user3, true);
		movie2.setAvaliation(user4, true);
		movie2.setAvaliation(user5, false);

		/*--- CRIA SUGESTÕES DE FILMES ---*/
		Recomendation recomendation = new Recomendation();
		recomendation.userRecomendation(user1, movie1, user2, "Gostosinho pode assistir");
		Recomendation recomendation2 = new Recomendation();
		recomendation2.userRecomendation(user2, movie2, user1, "Deve assistir");
		Recomendation recomendation3 = new Recomendation();
		recomendation3.userRecomendation(user4, movie3, user5, "Recomendo");
		Recomendation recomendation4 = new Recomendation();
		recomendation4.userRecomendation(user5, movie6, user2, "Pode assistir");

		/*--- ASSISTE FILMES ---*/
		WatchedMovie watchedMovie = new WatchedMovie();
		watchedMovie.watchedMovie(user13, movie1);
		watchedMovie.watchedMovie(user12, movie1);
		watchedMovie.watchedMovie(user11, movie1);
		watchedMovie.watchedMovie(user10, movie1);
		watchedMovie.watchedMovie(user5, movie2);

		/*--- IMPRIME LISTA DE USUÁRIOS ---*/
		System.out.println("\n--- Lista de Usuários ---");
		for (User users : usersList) {
			System.out.println(users.getFirstName());
		}

		/*--- IMPRIME LISTA DE FILMES ---*/
		System.out.println("\n--- Lista de filmes ---");
		for (Movie movie : movieList) {
			System.out.println(movie.getName());
		}
		/*--- IMPRIME INFORMAÇÕES SONBRE OS FILMES ASSISTIDOS E INADIMPLENTES ---*/
		watchedMovie.countMostWatchedGenre();
		System.out.println("Houve " + watchedMovie.getCountDefaulersTryWatch()
				+ " tentativas de usuários inadimplentes de assistir filmes.");
		
		System.out.println("O genero mais assistido foi: " + watchedMovie.getNameMostWathcedgenre()
				+ " que foi assistido um total de : " + watchedMovie.getCountMostWatchedGenre() + " vezes");
	}
}
