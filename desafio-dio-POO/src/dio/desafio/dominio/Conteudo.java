package dio.desafio.dominio;
/*
Classes abstratas não poderão ser instanciadas,
servirão como "modelo obrigatório" das classes filhas.
 */
public abstract class Conteudo {
    //final define uma constante em Java
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    /*métodos abstratos não precisam ter corpo na classe mãe,
    mas a existência deles nas classes filhas é obrigatória*/
    public abstract double calcularXp();

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
