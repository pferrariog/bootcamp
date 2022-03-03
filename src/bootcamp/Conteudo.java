package bootcamp;

public abstract class Conteudo {
    //herança

    protected static final double XP_PADRAO = 10d;
    //xp ganho ao final do conteudo

    private String titulo;
    private String descricao;

    //criaçao do metodo abstract calcular xp onde as classes filhas
    //vao precisar implementar a logica deste

    public abstract double calcularXp();

    //dessa forma nao se pode instanciar a classe conteudo


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
