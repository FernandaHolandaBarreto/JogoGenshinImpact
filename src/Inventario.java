public class Inventario {

    private String qtdDeComida;
    private String qtdDeMateriaisEssencias;
    private String qtditensDeMissao;
    private String qtdDeArtefatos;
    private String qtdDeArmas;
    private String qtdDeMora;

    public Inventario(String qtdDeComida, String qtdDeMateriaisEssencias, String qtditensDeMissao, String qtdDeArtefatos, String qtdDeArmas, String qtdDeMora) {
        this.qtdDeComida = qtdDeComida;
        this.qtdDeMateriaisEssencias = qtdDeMateriaisEssencias;
        this.qtditensDeMissao = qtditensDeMissao;
        this.qtdDeArtefatos = qtdDeArtefatos;
        this.qtdDeArmas = qtdDeArmas;
        this.qtdDeMora = qtdDeMora;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "qtdDeComida='" + qtdDeComida + '\'' +
                ", qtdDeMateriaisEssencias='" + qtdDeMateriaisEssencias + '\'' +
                ", qtditensDeMissao='" + qtditensDeMissao + '\'' +
                ", qtdDeArtefatos='" + qtdDeArtefatos + '\'' +
                ", qtdDeArmas='" + qtdDeArmas + '\'' +
                ", qtdDeMora='" + qtdDeMora + '\'' +
                '}';
    }

    public String getQtdDeComida() {
        return qtdDeComida;
    }

    public void setQtdDeComida(String qtdDeComida) {
        this.qtdDeComida = qtdDeComida;
    }

    public String getQtdDeMateriaisEssencias() {
        return qtdDeMateriaisEssencias;
    }

    public void setQtdDeMateriaisEssencias(String qtdDeMateriaisEssencias) {
        this.qtdDeMateriaisEssencias = qtdDeMateriaisEssencias;
    }

    public String getQtditensDeMissao() {
        return qtditensDeMissao;
    }

    public void setQtditensDeMissao(String qtditensDeMissao) {
        this.qtditensDeMissao = qtditensDeMissao;
    }

    public String getQtdDeArtefatos() {
        return qtdDeArtefatos;
    }

    public void setQtdDeArtefatos(String qtdDeArtefatos) {
        this.qtdDeArtefatos = qtdDeArtefatos;
    }

    public String getQtdDeArmas() {
        return qtdDeArmas;
    }

    public void setQtdDeArmas(String qtdDeArmas) {
        this.qtdDeArmas = qtdDeArmas;
    }

    public String getQtdDeMora() {
        return qtdDeMora;
    }

    public void setQtdDeMora(String qtdDeMora) {
        this.qtdDeMora = qtdDeMora;
    }
}
