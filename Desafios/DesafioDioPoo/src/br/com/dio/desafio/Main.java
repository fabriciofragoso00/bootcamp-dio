package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bootcamp bootcamp = new Bootcamp();
		
		Desenvolvedor dev_1 = new Desenvolvedor();
		Desenvolvedor dev_2 = new Desenvolvedor();
		
		Curso curso_1 = new Curso();
		Curso curso_2 = new Curso();
		
		Mentoria mentoria = new Mentoria();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Curso básico e intermediario de Java");
		bootcamp.getConteudos().add(curso_1);
		bootcamp.getConteudos().add(curso_2);
		bootcamp.getConteudos().add(mentoria);
		
		dev_1.setNome("Fabricio");
		dev_1.inscreverBootcamp(bootcamp);
		
		dev_2.setNome("Camila");
		dev_2.inscreverBootcamp(bootcamp);
		
		curso_1.setTitulo("Curso Java");
		curso_1.setDescricao("Aulas de POO");
		curso_1.setCargaHoraria(8);
		
		curso_2.setTitulo("Curso Angular");
		curso_2.setDescricao("Aulas do Framework Angular");
		curso_2.setCargaHoraria(16);
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Ajudar os Alunos");
		mentoria.setData(LocalDate.now());
		
		System.out.println("Conteudos Inscritos de " + dev_1.getNome() + ": " + dev_1.getConteudosInscritos());
		
		dev_1.progredir();
		dev_1.progredir();
		
		System.out.println();
		System.out.println("Conteudos  Inscritos de " + dev_1.getNome() + ": " + dev_1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos de " + dev_1.getNome() + ": " + dev_1.getConteudosConcluidos());
		System.out.println("Experiência: " + dev_1.calcularXpTotal() + " XP");
		
		System.out.println();
		
		System.out.println("Conteudos Inscritos de " + dev_2.getNome() + ": " + dev_2.getConteudosInscritos());
		
		dev_2.progredir();
		dev_2.progredir();
		dev_2.progredir();
		
		System.out.println();
		System.out.println("Conteudos Inscritos de " + dev_2.getNome() + ": " + dev_2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos de " + dev_2.getNome() + ": " + dev_2.getConteudosConcluidos());
		System.out.println("Experiência: " + dev_2.calcularXpTotal() + " XP");
	}

}
