package bootcamp;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java da DIO");
        curso1.setCargaHoraria(65);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Curso dKotlin da DIO");
        curso2.setCargaHoraria(50);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("criando projetos java");
        mentoria1.setDescricao("criando projetos voltados a poo");
        mentoria1.setData(LocalDate.now());
        //na hora que criarmos será atribuído o horário de criação devido ao metodo now

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);






        //criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Sportheca Mobile Developer");
        bootcamp.setDescricao("Bootcamp envolvendo Java, Kotlin e SQL Server");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //criando os devs participantes
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Dev Pedro");
        System.out.println("Conteúdos Inscritos: " + devPedro.getConteudosInscritos());

        devPedro.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devPedro.getConteudosConcluidos());
        System.out.println("XP Obtido: " + devPedro.calcularTotalXp());

        System.out.println("-----------");

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Dev Bruna");
        System.out.println("Conteúdos Inscritos: " + devBruna.getConteudosInscritos());

        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devBruna.getConteudosConcluidos());
        System.out.println("XP Obtido: " + devBruna.calcularTotalXp());


        //ao progredir, os conteudos em questão saem de inscritos e passam a concluidos
        //diminuindo a quantidade de conteudos que estao para serem concluidos


    }
}
