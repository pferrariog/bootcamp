package bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;
    //classe do java p/ trabalhar com datas


    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
        //a cada mentoria feita adicionará 20 de xp ao xp padrão do conteudo
    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
