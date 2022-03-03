package bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {


    //logica geral
    //quando se inscreve no bootcamp, ja se tem conteudosInscritos
    //a medida q se progride no bootcamp, estes se tornam conteudosConcluidos

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    //um set de conteudos inscritos e concluidos
    //para salvar na ordem, um linkedhashset
    //utiliza set pois permite apenas elementos unicos e uma pessoa faz um curso apenas 1 vez

    //a criação da classe conteudo como classe mae, permite q o set seja um curso ou uma mentoria

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        //quando passarmos esse metodo, o dev sera inscrito no determinado bootcamp
        //ao momento que se inscreve no bootcamp, adiciona-se aos conteudos inscritos os conteudos do bootcamp

        //adiciona aos devsIncritos no bootcamp, o dev em questão

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
        //pega-se o primeiro conteudo (curso ou mentoria) adicionado ao bootcamp
        //e ao realizar este, adiciona-o aos conteudosConcluidos e retira de conteudos inscritos
        //utiliza de conteudo.get pois pega-se o conteudo desta variavel auxiliar criada
        //caso nao tenha nenhum conteudo inscrito, imprime uma mensagem de erro ao usuario
    }

    public double calcularTotalXp(){
     return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();

        //pega-se cada conteudo do set de conteudosConcluidos e o xp desses, e realiza uma soma desses
        //resultando no total final de xp obtido a partir da quantidade de conteudosConcluidos
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
