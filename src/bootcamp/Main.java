package bootcamp;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java da DIO");
        curso1.setCargaHoraria(65);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Curso dKotlin da DIO");
        curso2.setCargaHoraria(50);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("criando projetos java");
        mentoria1.setDescricao("criando projetos voltados a poo");
        mentoria1.setData(LocalDate.now());
        //na hora que criarmos será atribuído o horário de criação devido ao metodo now

        System.out.println(mentoria1);
    }
}
