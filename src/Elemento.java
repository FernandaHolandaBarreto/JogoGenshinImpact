public class Elemento extends Personagem {

    private String tipoDeElemento;


    public Elemento(String nomeDoPersonagem,
                    String raridade, String contelacoes, String sobre, String tipoDeElemento) {
        super(nomeDoPersonagem, raridade, contelacoes, sobre);
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "tipoDeElemento='" + tipoDeElemento + '\'' +
                '}';
    }

    public String getTipoDeElemento() {
        return tipoDeElemento;
    }

    public void setTipoDeElemento(String tipoDeElemento) {
        this.tipoDeElemento = tipoDeElemento;
    }
}
