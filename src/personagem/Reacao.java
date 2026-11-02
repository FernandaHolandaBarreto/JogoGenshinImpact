package personagem;

public class Reacao extends Personagem {

    private String tipoDeReação;



    public Reacao(String nomeDoPersonagem, String raridade, String contelacoes,
                  String sobre, String tipoDeReação) {
        super(nomeDoPersonagem, raridade, contelacoes, sobre);
    }

    @Override
    public String toString() {
        return "Personagem.Reacao{" +
                "tipoDeReação='" + tipoDeReação + '\'' +
                '}';
    }

    public String getTipoDeReação() {
        return tipoDeReação;
    }

    public void setTipoDeReação(String tipoDeReação) {
        this.tipoDeReação = tipoDeReação;
    }
}
