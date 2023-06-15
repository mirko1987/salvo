package com.codeoftheweb.Salvo;

import com.codeoftheweb.Salvo.models.Game;
import com.codeoftheweb.Salvo.models.GamePlayer;
import com.codeoftheweb.Salvo.models.Player;
import com.codeoftheweb.Salvo.repository.GamePlayerRepository;
import com.codeoftheweb.Salvo.repository.GameRepository;
import com.codeoftheweb.Salvo.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDateTime;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository) {
		return (args) -> {
			// Players
			Player player1 = new Player("Jack");
			Player player2 = new Player("Chloe");
			Player player3 = new Player("Kim");
			Player player4 = new Player("David");
			playerRepository.save(player1);
			playerRepository.save(player2);
			playerRepository.save(player3);
			playerRepository.save(player4);

			// Games
			Game game1 = new Game(LocalDateTime.now());
			Game game2 = new Game(LocalDateTime.now().plusHours(1));
			Game game3 = new Game(LocalDateTime.now().plusHours(2));
			Game game4 = new Game(LocalDateTime.now().plusHours(3));
			Game game5 = new Game(LocalDateTime.now().plusHours(4));
			Game game6 = new Game(LocalDateTime.now().plusHours(5));
			Game game7 = new Game(LocalDateTime.now().plusHours(6));
			Game game8 = new Game(LocalDateTime.now().plusHours(7));
			gameRepository.save(game1);
			gameRepository.save(game2);
			gameRepository.save(game3);
			gameRepository.save(game4);
			gameRepository.save(game5);
			gameRepository.save(game6);
			gameRepository.save(game7);
			gameRepository.save(game8);

			//Game Players
			GamePlayer gamePlayer1 = new GamePlayer(game1, player1, LocalDateTime.now());
			GamePlayer gamePlayer2 = new GamePlayer(game1, player2, LocalDateTime.now());
			GamePlayer gamePlayer3 = new GamePlayer(game2, player1, LocalDateTime.now());
			GamePlayer gamePlayer4 = new GamePlayer(game2, player2, LocalDateTime.now());
			GamePlayer gamePlayer5 = new GamePlayer(game3, player2, LocalDateTime.now());
			GamePlayer gamePlayer6 = new GamePlayer(game3, player4, LocalDateTime.now());
			GamePlayer gamePlayer7 = new GamePlayer(game4, player2, LocalDateTime.now());
			GamePlayer gamePlayer8 = new GamePlayer(game4, player1, LocalDateTime.now());
			GamePlayer gamePlayer9 = new GamePlayer(game5, player4, LocalDateTime.now());
			GamePlayer gamePlayer10 = new GamePlayer(game5, player1, LocalDateTime.now());
			GamePlayer gamePlayer11 = new GamePlayer(game6, player3, LocalDateTime.now());
			GamePlayer gamePlayer12 = new GamePlayer(game7, player4, LocalDateTime.now());
			GamePlayer gamePlayer13 = new GamePlayer(game8, player3, LocalDateTime.now());
			GamePlayer gamePlayer14 = new GamePlayer(game8, player4, LocalDateTime.now());
			gamePlayerRepository.save(gamePlayer1);
			gamePlayerRepository.save(gamePlayer2);
			gamePlayerRepository.save(gamePlayer3);
			gamePlayerRepository.save(gamePlayer4);
			gamePlayerRepository.save(gamePlayer5);
			gamePlayerRepository.save(gamePlayer6);
			gamePlayerRepository.save(gamePlayer7);
			gamePlayerRepository.save(gamePlayer8);
			gamePlayerRepository.save(gamePlayer9);
			gamePlayerRepository.save(gamePlayer10);
			gamePlayerRepository.save(gamePlayer11);
			gamePlayerRepository.save(gamePlayer12);
			gamePlayerRepository.save(gamePlayer13);
			gamePlayerRepository.save(gamePlayer14);
		};
	}

	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**").allowedOrigins("*");
			}
		};
	}
}


