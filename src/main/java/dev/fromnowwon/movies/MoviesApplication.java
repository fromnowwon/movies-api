package dev.fromnowwon.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 해당 클래스가 애플리케이션의 주 진입점임을 나타냄
public class MoviesApplication { // 실제 애플리케이션의 메인 클래스

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}



}
