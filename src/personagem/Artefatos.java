package personagem;

public class Artefatos extends Personagem {

    private String nomeDasReliquias;
    private String quantidadeDePecas;
    private String sobreAsPecas;

    public Artefatos(String nomeDoPersonagem, String raridade,
                     String contelacoes, String sobre, String
                             nomeDasReliquias, String quantidadeDePecas, String sobreAsPecas) {
        super(nomeDoPersonagem, raridade, contelacoes, sobre);


    }

    @Override
    public String toString() {
        return "Personagem.Artefatos{" +
                "nomeDasReliquias='" + nomeDasReliquias + '\'' +
                ", quantidadeDePecas='" + quantidadeDePecas + '\'' +
                ", sobreAsPecas='" + sobreAsPecas + '\'' +
                '}';
    }

    public String getNomeDasReliquias() {
        return nomeDasReliquias;
    }

    public void setNomeDasReliquias(String nomeDasReliquias) {
        this.nomeDasReliquias = nomeDasReliquias;
    }

    public String getQuantidadeDePecas() {
        return quantidadeDePecas;
    }

    public void setQuantidadeDePecas(String quantidadeDePecas) {
        this.quantidadeDePecas = quantidadeDePecas;
    }

    public String getSobreAsPecas() {
        return sobreAsPecas;
    }

    public void setSobreAsPecas(String sobreAsPecas) {
        this.sobreAsPecas = sobreAsPecas;
    }
}
