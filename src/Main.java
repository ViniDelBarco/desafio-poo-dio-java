import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descrição curso Java Script");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso de Java iniciante III");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Vinicius");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + "(" + dev.getNome() + "): " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluídos " + "(" + dev.getNome() + "): " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        dev.progredir();

        System.out.println("====================== Progresso ======================");
        System.out.println("Conteudos inscritos " + "(" + dev.getNome() + "): " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluídos " + "(" + dev.getNome() + "): " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("=====================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Victor");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + "(" + dev2.getNome() + "): " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos " + "(" + dev2.getNome() + "): " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();

        System.out.println("====================== Progresso ======================");
        System.out.println("Conteudos inscritos " + "(" + dev2.getNome() + "): " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos " + "(" + dev2.getNome() + "): " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }

}