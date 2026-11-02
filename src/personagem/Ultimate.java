package personagem;

public class Ultimate implements Habilidades {

    private String nomeDoSupremo;



    @Override
    public void Habilidades(String atacar) {
        IO.println("Clicando no Supremo: " + atacar);
    }

    @Override
    public String toString() {
        return "Personagem.Ultimate{" +
                "nomeDoSupremo='" + nomeDoSupremo + '\'' +
                '}';
    }

    public String getNomeDoSupremo() {
        return nomeDoSupremo;
    }

    public void setNomeDoSupremo(String nomeDoSupremo) {
        this.nomeDoSupremo = nomeDoSupremo;
    }
}
