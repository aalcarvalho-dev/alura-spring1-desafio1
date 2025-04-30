package com.alura.spring_desafio1;

import java.io.File;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alura.spring_desafio1.model.Avaliacao;
import com.alura.spring_desafio1.model.Tarefa;
import com.alura.spring_desafio1.service.Conversor;

@SpringBootApplication
public class SpringDesafio1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/* 		System.out.print("Digite um número: ");
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		System.out.print("Contador: ");
		for (int i=1; i<=numero; i++) {
			System.out.print(i+" ");
		} */

		Tarefa tarefa = new Tarefa("Tarefa 1",false,"Fulaninho de tals");

		Conversor conversor = new Conversor();
		conversor.paraJson(tarefa);

		Tarefa tarefa2 = new Tarefa("Tarefa 2",true,"Cicrano de tels");
		conversor.paraJson(tarefa2);

		Tarefa tarefaRetornada = conversor.paraObjeto(Tarefa.class);

		System.out.println("tarefa retornada "+tarefaRetornada);

		System.out.println("===========================");

		Avaliacao<Tarefa> avaliacaoTarefa = new Avaliacao<>(tarefaRetornada,11.0,"pode melhorar");

		System.out.println(avaliacaoTarefa);
	}

}
