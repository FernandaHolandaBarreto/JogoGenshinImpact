package personagem;

public class Equipe {

    private double qtdDeAliados;
    private String tipoDeReacaoDaEquipe;
    private String tipoDeElemento;

    //Agregação (relação fraca)
    private Ultimate ultimate;


    public Equipe(double qtdDeAliados, String tipoDeReacaoDaEquipe, String tipoDeElemento) {
        this.qtdDeAliados = qtdDeAliados;
        this.tipoDeReacaoDaEquipe = tipoDeReacaoDaEquipe;
        this.tipoDeElemento = tipoDeElemento;
        ultimate = new Ultimate();

    }

    @Override
    public String toString() {
        return "Personagem.Equipe{" +
                "qtdDeAliados=" + qtdDeAliados +
                ", tipoDeReacaoDaEquipe='" + tipoDeReacaoDaEquipe + '\'' +
                ", tipoDeElemento='" + tipoDeElemento + '\'' +
                '}';
    }

    public double getQtdDeAliados() {
        return qtdDeAliados;
    }

    public void setQtdDeAliados(double qtdDeAliados) {
        this.qtdDeAliados = qtdDeAliados;
    }

    public String getTipoDeReacaoDaEquipe() {
        return tipoDeReacaoDaEquipe;
    }

    public void setTipoDeReacaoDaEquipe(String tipoDeReacaoDaEquipe) {
        this.tipoDeReacaoDaEquipe = tipoDeReacaoDaEquipe;
    }

    public String getTipoDeElemento() {
        return tipoDeElemento;
    }

    public void setTipoDeElemento(String tipoDeElemento) {
        this.tipoDeElemento = tipoDeElemento;
    }
}
