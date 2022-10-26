import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Potência Tech");
        bootcamp.setDescricao("BootCamp da DIO em parceria com ifood para formação de profissionais iniciantes em Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDyana = new Dev();
        devDyana.setNome("Dyana");
        devDyana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devDyana.getConteudosInscritos());
        devDyana.progredir();
        devDyana.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos " + devDyana.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos " + devDyana.getConteudosInscritos());
        System.out.println("XP: " + devDyana.calcularTotalXp());

        System.out.println("------------------------------------------------------------");

        Dev devJoao = new Dev();
        devDyana.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos conluídos " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
